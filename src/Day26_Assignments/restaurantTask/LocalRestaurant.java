package Day26_Assignments.restaurantTask;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant localRestaurant = new Restaurant("Muhter Bey","Tyson's corner mall",3);

        Server[] servers = new Server[3];
        servers[0] = new Server("Malio",1,21,true,LocalDate.of(2019,5,20));
        servers[1] = new Server("Larry",2,18,true,LocalDate.of(2021,2,14));
        servers[2] = new Server("Maria",3,19,true,LocalDate.of(2022,1,25));

        Chef[] chefs = new Chef[2];
        chefs[0] = new Chef("Chen",4,40,true);
        chefs[1] = new Chef("Jack",5,41,true);

        localRestaurant.servers.addAll(Arrays.asList(servers));
        localRestaurant.chefs.addAll(Arrays.asList(chefs));

        System.out.println(localRestaurant);

        localRestaurant.terminateServer(1);

        System.out.println(localRestaurant);

    }

}
