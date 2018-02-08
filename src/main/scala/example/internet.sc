def collatz(n: Long, c: Int = 0): Int = {
  if(n == 1) {
    c + 1
  } else {
    if(n % 2 == 0) collatz(n / 2, c + 1)
    else collatz(3*n + 1, c + 1)
  }
}
collatz(20)