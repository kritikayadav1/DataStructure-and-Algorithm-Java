package PracticeQuestions;

public class Count {
    int num = 124;
int original = num;
int count = 0;

while(num > 0) {

    int digit = num % 10;

    if(digit != 0 && original % digit == 0) {
        count++;
    }

    num = num / 10;
}

System.out.println(count);
}
