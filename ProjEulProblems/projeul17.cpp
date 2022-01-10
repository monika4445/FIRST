#include <iostream>
#include <string>
std::string convert(unsigned long long);

int main()
{
    int count = 0; std::string str2;
  
    for(int i = 1; i <= 1000; ++i){
       str2 += convert(i);
    }
    for(int i = 0; str2[i] != '\0'; ++i){
       if(std::isalpha(str2[i]))  // OR ->  if(str2[i] != ' ' && str2[i] != '-')
        ++count;
    }
    
  std::cout<< count <<std::endl;
  //std::cout<< str2;

  return 0;
}

std::string convert(unsigned long long num)
{
  const std::string Gap = " and ";
  const std::string Connect = "-";



  switch(num)
  {
    case  0: return "Zero";
    case  1: return "One";
    case  2: return "Two";
    case  3: return "Three";
    case  4: return "Four";
    case  5: return "Five";
    case  6: return "Six";
    case  7: return "Seven";
    case  8: return "Eight";
    case  9: return "Nine";
    case 10: return "Ten";
    case 11: return "Eleven";
    case 12: return "Twelve";
    case 13: return "Thirteen";
    case 14: return "Fourteen";
    case 15: return "Fifteen";
    case 16: return "Sixteen";
    case 17: return "Seventeen";
    case 18: return "Eighteen";
    case 19: return "Nineteen";
    default: break;
  }

  if (num >= 20 && num < 100)
  {
    auto ones = num % 10;
    auto tens = num / 10;
    auto strOnes = (ones != 0) ? Connect + convert(ones) : "";
    switch (tens)
    {
      case 2: return "Twenty"  + strOnes;
      case 3: return "Thirty"  + strOnes;
      case 4: return "Forty"   + strOnes; 
      case 5: return "Fifty"   + strOnes;
      case 6: return "Sixty"   + strOnes;
      case 7: return "Seventy" + strOnes;
      case 8: return "Eighty"  + strOnes;
      case 9: return "Ninety"  + strOnes;
      default: break;
    }
  }

  if (num >= 100 && num < 1000)
  {
    auto onesAndTens = num % 100;
    auto hundreds    = num / 100;
    auto strOnesAndTens = (onesAndTens != 0) ? Gap + convert(onesAndTens) : "";
    return convert(hundreds) + " Hundred" + strOnesAndTens;
  }
  
  if (num >= 1000 && num < 1000000)
  {
    auto low  = num % 1000;
    auto high = num / 1000;
    auto strLow = (low != 0) ? Gap + convert(low) : "";
    return convert(high) + " Thousand" + strLow;
  }

  if (num >= 1000000 && num < 1000000000)
  {
    auto low  = num % 1000000;
    auto high = num / 1000000;
    auto strLow = (low != 0) ? Gap + convert(low) : "";
    return convert(high) + " Million" + strLow;
  }

  if (num >= 1000000000 && num < 1000000000000ULL) 
  {
    auto low  = num % 1000000000;
    auto high = num / 1000000000;
    auto strLow = (low != 0) ? Gap + convert(low) : "";
    return convert(high) + " Billion" + strLow;
  }

  if (num >= 1000000000000ULL && num < 1000000000000000ULL)
  {
    auto low  = num % 1000000000000ULL;
    auto high = num / 1000000000000ULL;
    auto strLow = (low != 0) ? Gap + convert(low) : "";
    return convert(high) + " Trillion" + strLow;
  }

  return "Error!";
}
