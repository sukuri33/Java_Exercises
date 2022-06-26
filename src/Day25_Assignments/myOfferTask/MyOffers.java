package Day25_Assignments.myOfferTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

    Offer offerLetter1 = new Offer("TX","Tesla","Java developer",140000,false,false,false,false);
    Offer offerLetter2 = new Offer("CA","Apple","SpringBoot developer",160000,true,true,false,false);
    Offer offerLetter3 = new Offer("CA","FaceBook","Automation Test Engineer",99000,false,false,true,false);
    Offer offerLetter4 = new Offer("VA","ITG","Appian/Java developer",153000,true,true,false,true);



    Offer[] offers = {offerLetter1,offerLetter2,offerLetter3,offerLetter4};

        ArrayList<Offer> fullTimeJob = new ArrayList<>(Arrays.asList(offers));
        fullTimeJob.removeIf(p -> !p.isFullTime);

        ArrayList<Offer> localJob = new ArrayList<>(Arrays.asList(offers));
        localJob.removeIf(p -> !p.location.equals("TX"));

        ArrayList<Offer> offerWithBenefits = new ArrayList<>(Arrays.asList(offers));
        offerWithBenefits.removeIf(p -> !p.hasBenefit);

        ArrayList<Offer> devJobs = new ArrayList<>(Arrays.asList(offers));
        devJobs.removeIf(p -> !p.jobTitle.contains("developer"));

        ArrayList<Offer> jobPays100K = new ArrayList<>(Arrays.asList(offers));
        jobPays100K.removeIf(p -> p.salary < 100000);

        System.out.println("Full time job offer: "+fullTimeJob);
        System.out.println("Local job offer: "+localJob);
        System.out.println("Job with benefits: "+offerWithBenefits);
        System.out.println("Developer position offer: "+devJobs);
        System.out.println("Job pays equal/more than 100k: "+jobPays100K);

    }

    /*


    5.2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
     */

}
