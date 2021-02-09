import textio.TextIO;
class DiamondRush {

        public static void main(String[] args) {

                System.out.println("This game is all about high value and Diamonds!");
                System.out.println("You will be dealt a random card.");
                System.out.println("If the card is a diamond, or value over 10...");
                System.out.println("You win!");
                System.out.println("Otherwise, you lose.");
                System.out.println();

                deal();

        }

        private static void deal() {
                int wins = 0;
                int losses = 0;
                Deck deck = new Deck();
                Card currentCard;
                deck.shuffle();

                System.out.print("Would you like to play? ");
                String play = TextIO.getlnString();

                do {
                        do {
                                if (play.compareToIgnoreCase("no") == 0 || play.compareToIgnoreCase("n") == 0) {
                                        System.out.print("Maybe next time!");
                                        return; // ends the main method
                                } else if (play.compareToIgnoreCase("yes") == 0 || play.compareToIgnoreCase("y") == 0) {
                                        currentCard = deck.dealCard();
                                        System.out.println("The card is the " + currentCard);

                                        if (currentCard.getValue() > 9) {
                                                System.out.println("Congratulations! You win!");
                                                wins++;
                                                System.out.println("You won " + wins + " times.");
                                                System.out.println("You lost " + losses + " times.");
                                        } else if (currentCard.getSuit() == 3) {
                                                System.out.println("Congratulations! You win!");
                                                wins++;
                                                System.out.println("You won " + wins + " times.");
                                                System.out.println("You lost " + losses + " times.");
                                        }

                                        else {
                                                System.out.println("I'm sorry, you lose.");
                                                losses++;
                                                System.out.println("You won " + wins + " times.");
                                                System.out.println("You lost " + losses + " times.");
                                        }
                                        break;
                                } else {
                                        System.out.print("Please enter yes or no: ");
                                        play = TextIO.getlnString();
                                }
                        } while (true);
                        System.out.print("\n Would you like to play again? ");
                        play = TextIO.getlnString();
                } while (true);

        }

}
