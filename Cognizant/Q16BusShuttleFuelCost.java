public class Q16BusShuttleFuelCost {
    public static int getBusShuttleFuelCost(int N,int P,int Q)
    {
        // bus capacity: 80 People
        int busCapacity=80;
        // shuttle capacity: 8 People
        int shuttleCapacity=8;
        // fuel price
        int fuelPrice=75;
        // No of buses required to fit max 80 multiple peoples
        int buses=N/busCapacity;
        // Remaining Peoples less than 80
        int remainingPeople=N%busCapacity;
        // Cost calculated upto used buses till now
        int cost=buses*P*fuelPrice;
        // if remaining peoples are available we check for best possible combination for 1 bus or shuttles as per req
        if(remainingPeople>0)
        {
            // Ceiling division remaining peoples / shuttle capacity
            int shuttles=(int)Math.ceil((double)remainingPeople/shuttleCapacity);
            // int shuttles = (remainingPeople + shuttleCapacity - 1) / shuttleCapacity;
            // shuttle cost calculation
            int shuttleCost=shuttles*Q*fuelPrice;
            // cost of 1 bus
            int busCost=P*fuelPrice;
            // minimun cost among shuttles of bus gets added to the final cost of the fuel expenditure
            cost=cost+Math.min(shuttleCost,busCost);
        }
        return cost;
    }
    public static void main(String[] args) {
        System.out.println(getBusShuttleFuelCost(240, 50, 8));
        System.out.println(getBusShuttleFuelCost(95, 60, 10));
        System.out.println(getBusShuttleFuelCost(160, 100, 5));
    }
}
