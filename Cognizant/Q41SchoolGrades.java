public class Q41SchoolGrades {
    public static char[] assignGrades(int N,int []marks)
    {
        char Grade[]=new char[N];
        for(int i=0;i<N;i++)
        {
            int cm=marks[i];
            if(cm>=10 && cm<=40)
            {
                Grade[i]='F';
            }else if(cm>=41 && cm<=50)
            {
                Grade[i]='C';
            }else if(cm>=51 && cm<=60)
            {
                Grade[i]='B';
            }else if(cm>=61 && cm<=80)
            {
                Grade[i]='A';
            }else{
                Grade[i]='S';
            }
        }
        return Grade;
    }
    public static void main(String[] args) {
        int marks[]={81,61,51,41,11};
        char grades[]=assignGrades(5, marks);
        for(int m:marks){
            System.out.print(m+" ");
        }
        System.out.println();
        for(char c:grades)
        {
            System.out.print(c+" ");
        }
    }
}
