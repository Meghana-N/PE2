public class PowerOfFourCheck {
    public String checkPowerOfFour(int num)
    {
        if(num == 0)
            return "Number is not a power of 4";
        while(num != 1)
        {
            if(num % 4 != 0)
                return "Number is not a power of 4";
            num = num / 4;
        }
        return "Number is a power of 4";
    }

}
