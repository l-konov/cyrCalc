def args = "9898"
def inputValue = args.toInteger()
if ((inputValue > 9999) || (inputValue < 1)) 
{ 
  println 'Введён аргумент менее 1 или более 9999. Введите аргумент в диапазоне от 1 до 9999.'
  return
} 
charArr = args.toCharArray()
def thousands, hundreds, tens, units = null
switch (charArr.length) {
  case 4:
    thousands = charArr[0]
    hundreds = charArr[1]
    tens = charArr[2]
    units = charArr[3]
    break
  case 3: 
    hundreds = charArr[0]
    tens = charArr[1]
    units = charArr[2]
    break
  case 2: 
    tens = charArr[0]
    units = charArr[1]
    break
  case 1: 
    units = charArr[0]
    break
  default:
    println 'Ошибка разбора числа'
    return
}

if (tens == '1') {
  println "•${processThousands(thousands)}\u0483${processHundreds(hundreds)}${processUnits(units)}${processTens(tens)}•"
} else {
 println "•${processThousands(thousands)}\u0483${processHundreds(hundreds)}${processTens(tens)}${processUnits(units)}•" //\u0483
}


def processThousands(th){
  if (th == null) {return ''}
  else {return "҂${processUnits(th)}"}
}

def processUnits(u) {
  switch (u) {
    case '1':
      return 'а'
    case '2':
      return 'в'
    case '3':
      return 'г'
    case '4':
      return 'д'
    case '5':
      return 'е'
    case '6':
      return 's'
    case '7':
      return 'з'
    case '8':
      return 'и'
    case '9':
      return 'ѳ' //??
    default:
      return ''
  }
}

def processHundreds(h) {
  switch (h) {
    case '1':
      return 'р'
    case '2':
      return 'с'
    case '3':
      return 'т'
    case '4':
      return 'у'
    case '5':
      return 'ф'
    case '6':
      return 'х'
    case '7':
      return 'ѱ'
    case '8':
      return 'ѿ'
    case '9':
      return 'ц' //??
    default:
      return ''
  }
}

def processTens(t) {
  switch (t) {
    case '1':
      return 'і'
    case '2':
      return 'к'
    case '3':
      return 'л'
    case '4':
      return 'м'
    case '5':
      return 'н'
    case '6':
      return 'ѯ'
    case '7':
      return 'о'
    case '8':
      return 'п'
    case '9':
      return 'ч' 
    default:
      return ''
  }
}
