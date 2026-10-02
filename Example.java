import java.util.Scanner;
void main(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = 100;

    int count = 0;
    for(int i = 1; i<=n ; i++){
        if(i%3==0 || i%5==0)
            count++;
    }
    System.out.println("count is "+count);
}