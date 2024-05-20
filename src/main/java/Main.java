import entity.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final Map<String, String> numberToBengaliMap = new HashMap<>();

    static {
        numberToBengaliMap.put("0", "শূন্য");
        numberToBengaliMap.put("1", "এক");
        numberToBengaliMap.put("2", "দুই");
        numberToBengaliMap.put("3", "তিন");
        numberToBengaliMap.put("4", "চার");
        numberToBengaliMap.put("5", "পাঁচ");
        numberToBengaliMap.put("6", "ছয়");
        numberToBengaliMap.put("7", "সাত");
        numberToBengaliMap.put("8", "আট");
        numberToBengaliMap.put("9", "নয়");
        numberToBengaliMap.put("10", "দশ");
        numberToBengaliMap.put("11", "এগারো");
        numberToBengaliMap.put("12", "বারো");
        numberToBengaliMap.put("13", "তেরো");
        numberToBengaliMap.put("14", "চৌদ্দ");
        numberToBengaliMap.put("15", "পনেরো");
        numberToBengaliMap.put("16", "ষোল");
        numberToBengaliMap.put("17", "সতেরো");
        numberToBengaliMap.put("18", "আঠারো");
        numberToBengaliMap.put("19", "ঊনিশ");
        numberToBengaliMap.put("20", "বিশ");
        numberToBengaliMap.put("21", "একুশ");
        numberToBengaliMap.put("22", "বাইশ");
        numberToBengaliMap.put("23", "তেইশ");
        numberToBengaliMap.put("24", "চব্বিশ");
        numberToBengaliMap.put("25", "পঁচিশ");
        numberToBengaliMap.put("26", "ছাব্বিশ");
        numberToBengaliMap.put("27", "সাতাশ");
        numberToBengaliMap.put("28", "আটাশ");
        numberToBengaliMap.put("29", "ঊনত্রিশ");
        numberToBengaliMap.put("30", "ত্রিশ");
        numberToBengaliMap.put("31", "একত্রিশ");
        numberToBengaliMap.put("32", "বত্রিশ");
        numberToBengaliMap.put("33", "তেত্রিশ");
        numberToBengaliMap.put("34", "চৌত্রিশ");
        numberToBengaliMap.put("35", "পঁইত্রিশ");
        numberToBengaliMap.put("36", "ছত্রিশ");
        numberToBengaliMap.put("37", "সাইত্রিশ");
        numberToBengaliMap.put("38", "আটত্রিশ");
        numberToBengaliMap.put("39", "ঊনচল্লিশ");
        numberToBengaliMap.put("40", "চল্লিশ");
        numberToBengaliMap.put("41", "একচল্লিশ");
        numberToBengaliMap.put("42", "বিয়াল্লিশ");
        numberToBengaliMap.put("43", "তেতাল্লিশ");
        numberToBengaliMap.put("44", "চুয়াল্লিশ");
        numberToBengaliMap.put("45", "পঁইতাল্লিশ");
        numberToBengaliMap.put("46", "ছেচল্লিশ");
        numberToBengaliMap.put("47", "সাতচল্লিশ");
        numberToBengaliMap.put("48", "আটচল্লিশ");
        numberToBengaliMap.put("49", "ঊনপঞ্চাশ");
        numberToBengaliMap.put("50", "পঞ্চাশ");
        numberToBengaliMap.put("51", "একান্ন");
        numberToBengaliMap.put("52", "বায়ান্ন");
        numberToBengaliMap.put("53", "তিপ্পান্ন");
        numberToBengaliMap.put("54", "চুয়ান্ন");
        numberToBengaliMap.put("55", "পঁইচান্ন");
        numberToBengaliMap.put("56", "ছাপ্পান্ন");
        numberToBengaliMap.put("57", "সাতান্ন");
        numberToBengaliMap.put("58", "আটান্ন");
        numberToBengaliMap.put("59", "ঊনষাট");
        numberToBengaliMap.put("60", "ষাট");
        numberToBengaliMap.put("61", "একষট্টি");
        numberToBengaliMap.put("62", "বাষট্টি");
        numberToBengaliMap.put("63", "তেষট্টি");
        numberToBengaliMap.put("64", "চৌষট্টি");
        numberToBengaliMap.put("65", "পঁইষট্টি");
        numberToBengaliMap.put("66", "ছেষট্টি");
        numberToBengaliMap.put("67", "সাতষট্টি");
        numberToBengaliMap.put("68", "আটষট্টি");
        numberToBengaliMap.put("69", "ঊনসত্তর");
        numberToBengaliMap.put("70", "সত্তর");
        numberToBengaliMap.put("71", "একাত্তর");
        numberToBengaliMap.put("72", "বাহাত্তর");
        numberToBengaliMap.put("73", "তিয়াত্তর");
        numberToBengaliMap.put("74", "চুয়াত্তর");
        numberToBengaliMap.put("75", "পঁচাত্তর");
        numberToBengaliMap.put("76", "ছিয়াত্তর");
        numberToBengaliMap.put("77", "সাতাত্তর");
        numberToBengaliMap.put("78", "আটাত্তর");
        numberToBengaliMap.put("79", "ঊনআশি");
        numberToBengaliMap.put("80", "আশি");
        numberToBengaliMap.put("81", "একাশি");
        numberToBengaliMap.put("82", "বিরাশি");
        numberToBengaliMap.put("83", "তিরাশি");
        numberToBengaliMap.put("84", "চুরাশি");
        numberToBengaliMap.put("85", "পঁচাশি");
        numberToBengaliMap.put("86", "ছিয়াশি");
        numberToBengaliMap.put("87", "সাতাশি");
        numberToBengaliMap.put("88", "আটাশি");
        numberToBengaliMap.put("89", "ঊননব্বই");
        numberToBengaliMap.put("90", "নব্বই");
        numberToBengaliMap.put("91", "একানব্বই");
        numberToBengaliMap.put("92", "বিরানব্বই");
        numberToBengaliMap.put("93", "তিরানব্বই");
        numberToBengaliMap.put("94", "চুরানব্বই");
        numberToBengaliMap.put("95", "পঁচানব্বই");
        numberToBengaliMap.put("96", "ছিয়ানব্বই");
        numberToBengaliMap.put("97", "সাতানব্বই");
        numberToBengaliMap.put("98", "আটানব্বই");
        numberToBengaliMap.put("99", "নিরানব্বই");
    }

    private static String banglaMoneyCommaFormatter(String amount) {
        StringBuilder result = new StringBuilder();
        String[] parts = amount.split("\\.");
        String integerPart = parts[0];

        try {
            StringBuilder tempString = new StringBuilder();
            for (int i = 0; i < integerPart.length(); i++) {
                char digitChar = integerPart.charAt(i);

                int positionFromRight = integerPart.length() - 1 - i;
                int positionInGroup = positionFromRight >= 9 ? ((positionFromRight -2 ) % 7 ) + 2 : positionFromRight % 9;

                if (tempString.length() != 0 || digitChar != '0' ) {
                    tempString.append(digitChar);
                }

                if (positionInGroup == 7) {
                    if (tempString.length() != 0) {
                        result.append(numberToBengaliMap.get(tempString.toString()));
                        result.append(" কোটি ");
                    }
                    tempString.setLength(0);
                }

                if (positionInGroup == 5) {
                    if (tempString.length() != 0) {
                        result.append(numberToBengaliMap.get(tempString.toString()));
                        result.append(" লক্ষ ");
                    }
                    tempString.setLength(0);
                }

                if (positionInGroup == 3) {
                    if (tempString.length() != 0) {
                        tempString.append(digitChar);
                        result.append(numberToBengaliMap.get(tempString.toString()));
                        result.append(" হাজার ");
                    }
                    tempString.setLength(0);
                }

                if (positionInGroup == 2) {
                    if (tempString.length() != 0) {
                        result.append(numberToBengaliMap.get(tempString.toString()));
                        result.append(" শত ");
                    }
                    tempString.setLength(0);
                }
                if (positionInGroup == 0) {
                    if (tempString.length() != 0) {
                        result.append(numberToBengaliMap.get(tempString.toString()));
                    }
                }

            }
            if (result.length() == 0) {
                result.append(numberToBengaliMap.get("0"));
            }

            // Add the decimal part if present
            if (parts.length > 1) {
                result.append(".").append(parts[1]);
            }
        } catch (Exception e) {
            return amount;
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String num = banglaMoneyCommaFormatter("1141014001410000001");
        System.out.printf(num);
    }
}