    public class PalinOps {
        private String text;
        PalinOps(String text){
            this.text=text;
        }
        public boolean isPalin()
        {
            int left=0,right=text.length()-1;
            while(left<right)
            {
                if(text.toLowerCase().charAt(left)!=text.toLowerCase().charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }
        public void displayisPalin()
        {
            if(isPalin())
            {
                System.out.println(text+" is Palindrome");
            }else{
                System.out.println(text+" is Not Palindrome");
            }
        }
        public static void main(String[] args) {
            PalinOps p=new PalinOps("Tenet");
            p.displayisPalin();
        }
    }
