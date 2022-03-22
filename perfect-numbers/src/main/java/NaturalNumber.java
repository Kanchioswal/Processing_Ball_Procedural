class NaturalNumber {
 Classification classification;
 public NaturalNumber(int number) throws IllegalArgumentException{
  if(number<=0){
   throw new IllegalArgumentException("You must supply a natural number (positive integer)");
  }
  int temporary=0;
  for (int i =1; i<number;i++){
   if(number%i == 0){
    temporary+=i;
   }
  }
  if(temporary==number){
   this.classification=Classification.PERFECT;
  }else if(temporary<number){
   this.classification=Classification.DEFICIENT;
  }else{
   this.classification=Classification.ABUNDANT;
  }
 }
 Classification getClassification(){
  return classification;
 }
}
