package homework.class14;

public class StringMethods4 {
    public static void main(String[] args) {

        /*How would you reverse a string word by word?
         */
        StringBuilder stringBuilder=new StringBuilder("This is the sentence I want to reserve");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        String str="This is the sentence I want to reserve";
        String[] arr=str.split(" ");
        StringBuilder st=new StringBuilder();

        for(int i=0; i<arr.length; i++){
            String word=arr[i];
            StringBuilder stringBuilder1=new StringBuilder(word);
            stringBuilder1.reverse();
            arr[i]=stringBuilder1.toString();
            st.append(arr[i]).append(" ");

        }
        System.out.println(st);



    }
}
