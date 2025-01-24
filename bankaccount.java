class bankaccount
{
    int calculateInterest(int p, int r)
    {
        return (p*r)/100;
    }
    int calculateInterest(int p, int r, int t)
    {
        return(p*r*t)/100;
    }
    int calculateInterest()
    {
        return 0;
    }
}

class testclass1
{
    public static void main(String args[])
    {
        bankaccount b = new bankaccount();
        System.out.println("Saving Account Interest : " + b.calculateInterest(200000,8));
        System.out.println("Fixed Deposit Interest : " + b.calculateInterest(200000,10));
        System.out.println("Current Account Interest : " + b.calculateInterest());
    }
}