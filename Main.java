public class Main {
    public static void main(String[] args) {
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        for(int i=0; i< exampleOne.getArrayList().size(); i++){
            System.out.print(exampleOne.getArrayList().get(i)+ " ");                
        }
        System.out.println();
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        for(int i=0; i< exampleTwo.getArrayList().size(); i++){
            System.out.print(exampleTwo.getArrayList().get(i)+ " ");                
        }
        System.out.println();

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.numMatches());
    }
}

