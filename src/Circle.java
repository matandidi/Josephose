
        // Driver code
        public static void main(String [] args)
        {
            int n = 14; // specific n and k values for original
            // josephus problem
            int k = 2;
            k--; // (k-1)th person will be killed
            int index
                    = 0; // The index where the person which will die

            List<Integer> person = new ArrayList<>();

            // fill the person vector
            for (int i = 1; i <= n; i++) {
                person.add(i);
            }

            Josh(person, k, index);
        }
    }

// This code is contributed by umadevi9616


