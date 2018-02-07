def collatz(n: Int) = n match{

  case even if n %2 ==0 =>  n/2
  case odd if n %2 ==1 => (n * 3) + 1

}
collatz(20)