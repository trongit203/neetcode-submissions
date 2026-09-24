class Solution {
    fun checkValid(board: Array<CharArray>, rowIdx: Int, colIdx: Int): Boolean { 
        // check row
        val listCount = hashSetOf<Char>()
        for (i in 0 until 9) { 
            if (board[rowIdx][i] == '.') continue
            if (listCount.contains(board[rowIdx][i])) { 
                return false 
            } else { 
                listCount.add(board[rowIdx][i])
            }
        }   
        listCount.clear()
        // check col
        for(i in 0 until 9) { 
            if (board[i][colIdx] == '.') continue
            if (listCount.contains(board[i][colIdx])) { 
                return false
            } else { 
                listCount.add(board[i][colIdx])
            }
        }
        listCount.clear()
        // check 3x3 sub-boxes
        if (rowIdx <= 2 && colIdx <= 2) {
            for(i in 0 until 3) { 
                for (j in 0 until 3) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 2 && colIdx <= 5) { 
            for(i in 0 until 3) { 
                for (j in 3 until 6) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 2 && colIdx <= 8) { 
            for (i in 0 until 3) { 
                for (j in 6 until 9) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 5 && colIdx <= 2) { 
            for (i in 3 until 6) { 
                for (j in 0 until 3) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 5 && colIdx <= 5) { 
            for( i in 3 until 6) { 
                for (j in 3 until 6) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 5 && colIdx <= 8) { 
            for(i in 3 until 6) { 
                for(j in 6 until 9) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 8 && colIdx <= 2) { 
            for (i in 6 until 9) { 
                for (j in 0 until 3) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 8 && colIdx <= 5) { 
            for(i in 6 until 9) { 
                for (j in 3 until 6) {
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        } else if (rowIdx <= 8 && colIdx <= 8) { 
            for(i in 6 until 9) { 
                for (j in 6 until 9) { 
                    if (board[i][j] == '.' ) continue
                    if (listCount.contains(board[i][j])) return false
                    listCount.add(board[i][j])
                }
            }
        }
        return true

    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val n = 9
        for(i in 0 until 9) { 
            for(j in 0 until 9) { 
                if (!checkValid(board, i, j)) { 
                    return false
                }
            }
        }
        return true
    }
}
