import java.util.Objects;
import java.util.Stack;

public class Calculate {
	private String infix;
	private String postfix;
	private Integer result;
	
	public Calculate(String infix){
		this.infix = infix;
		this.postfix = "";
		this.result = null;
	}
	
	public void calculate() {
		this.convertToPostfix();
		this.result = this.evaluate();
	}
	
	public Integer getResult() {
		return this.result;
	}
	
	public String getPostfix() {
		this.convertToPostfix();
		// this.toPostfix();
		return this.postfix;
	}
	
	public int precedence(char c) {
		if(new Character('+').equals(c) || new Character('-').equals(c))
			return 1;
		else
			return 2;
	}
	
	public int evaluate() {
		int result = 0;
		
		Stack<Integer> mystack = new Stack<Integer>();		// declare an integer stack
		char op;				// declare a character
		// declare two integers to store operands we need to operate on
		int ap1 = 0;
		int ap2 = 0;

		int len = this.postfix.length();		// store length of the this.postfix string

		// loop to iterate through every character in infix string
		for(int i=0; i<len; i++){
			// if character at this.postfix index i is a space, do nothing
			if(Character.isWhitespace(this.postfix.charAt(i)))
				continue;
			// if character at this.postfix index i is a digit
			else if(Character.isDigit(this.postfix.charAt(i))){
				int temp = 0;		// initialize an integer to 0
				// while loop to convert numbers from string to integer
				while(Character.isDigit(this.postfix.charAt(i))){
					temp = temp * 10 + this.postfix.charAt(i) - '0';		// converts numbers from char to integer
					i++;		// increment i by 1
				}
				mystack.push(temp);		// push number to mystack
			}
			// if character at this.postfix index i is an operator
			else{
				op = this.postfix.charAt(i);	// set op of type char to the character at this.postfix index i

				if(!mystack.empty()){
					ap1 = mystack.peek();	// set ap1 to the item at the top of the stack
					mystack.pop();		// remove the item at the top of the stack
				}
				if(!mystack.empty()){
					ap2 = mystack.peek();	// set ap2 to the item at the top of the stack
					mystack.pop();		// remove the item at the top of the stack
	            }
				
				switch(op){
					case '+': mystack.push(ap1+ap2);		// if operator is addition, add ap1 and ap2, then push to stack
						break;
					case '-': mystack.push(ap2 - ap1);		// if operator is subtraction, subtract ap1 and ap2, then push to stack
						break;
					case '*': mystack.push(ap1 * ap2);		// if operator is multiplication, multiply ap1 and ap2, then push to stack
						break;
					case '/': mystack.push(ap2/ap1);		// if operator is division, divide ap1 and ap2, then push to stack
						break;
					case '%': mystack.push(ap2 % ap1);		// if operator is modulo, push modulo of ap1 and ap2 to stack
				}

			}
		}

		if(!mystack.empty())
		{
			result = mystack.peek();
		}
		
		return result;
	}
	
	
	public void convertToPostfix(){
       int priority = 0;
       Stack s1 = new Stack();
       int infixLength = this.infix.length();
       int j;
       
       for (int i = 0; i < infixLength; i++){
          char ch = this.infix.charAt(i);
          if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
             // check the precedence
             if (s1.size() <= 0)
                s1.push(ch);
             else{
                Character chTop = (Character) s1.peek();
                if (chTop == '*' || chTop == '/')
                   priority = 1;
                else
                   priority = 0;
                if (priority == 1){
                   if (ch == '+' || ch == '-'){
                      this.postfix += s1.pop();
                      i--;
                   }
                   else{ // Same
                      this.postfix += s1.pop();
                      i--;
                   }
                }
                else{
                   if (ch == '+' || ch == '-'){
                      this.postfix += s1.pop();
                      s1.push(ch);
                   }
                   else
                      s1.push(ch);
                }
             }
          }
          else{
              this.postfix += ch + " ";
          }
       }
       
       while(!s1.empty()) {
          this.postfix += s1.pop();
       }
       
       System.out.println(postfix);
    }
}
