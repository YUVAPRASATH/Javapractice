package com.practice.intervicequestions.infogain;

import java.util.*;
import java.util.stream.Collectors;

public class InfoGain {
    public static void main(String args[]){
        List<Product> productList = new ArrayList<>();
        Map<String, Integer> minNumofFeatures = new HashMap<String, Integer>() {{put("Mobile", 2);}};
        // Adding product to the list
        {
            productList.add(new Product("Samsung", "Mobile", 1500,
                    new HashMap<String, String>() {{
                        put("feature1", "feature1");
                        put("feature2", "feature2");
                        put("feature3", "feature3");

                    }}

            ));
            productList.add(new Product("Nokia", "Mobile", 1800,
                    new HashMap<String, String>() {{
                        put("feature1", "feature1");
                        put("feature2", "feature2");
                        put("feature3", "feature3");

                    }}

            ));

            productList.add(new Product("Apple", "Mobile", 800,
                    new HashMap<String, String>() {{
                        put("feature1", "feature1");
                    }}

            ));
        }

        // Filters Product with min Features
        List<Product> result =productList.stream()
                .filter(x -> x.getFeatures().values().size() > minNumofFeatures.get(x.getCategory()))
                .collect(Collectors.toList());

        System.out.println(result.size());

       List<DeliveryAddress> deliveryAddressList = Arrays.asList(
               new DeliveryAddress("Samsung","Salem","636309"),
               new DeliveryAddress("Nokia","Salem","560066")
               );

        // Provide list of Pincode where product priced greater than 1000 are delivered.

        List<String> productGreaterThanThousand =
                productList.stream()
                    .filter(x->x.getPrice() > 1000)
                        .map(x-> x.getName())
                        .collect(Collectors.toList());

        System.out.println(productGreaterThanThousand);
        List<String> pincodeList = deliveryAddressList.stream()
                                        .filter(x-> productGreaterThanThousand.contains(x.getProductName()))
                                        .map(x -> x.getPincode())
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println(pincodeList);

    }
}

