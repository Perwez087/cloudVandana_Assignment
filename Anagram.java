class Anagram{
  public static void sortArray(char arr[]){
    for(int i=0;i<arr.length;i++){
     for(int j=i+1;j<arr.length;j++){
       if(arr[i] > arr[j]){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
         }
     }
    }
  }
  public static void main(String args[]){
  String str1= "listen";
  String str2= "silent";
  
  char [] arr1 = str1.toLowerCase().toCharArray();
  char [] arr2 = str2.toLowerCase().toCharArray();

  sortArray(arr1);
  sortArray(arr2);

  Boolean isAnagram = true;
  for(int i=0;i<arr1.length;i++){
     if(arr1[i] != arr2[i]){
         isAnagram = false;
         return;
      }
   }
  
  if(isAnagram){
    System.out.println("True");
  }else{
    System.out.println("False");
  }

}
}