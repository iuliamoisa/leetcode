class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
      // inital nums = [-1, -2, 3, 4]
      //creez perechi <pozitie,valoare> pt a sti mereu care era locul fiecarei valori in arrayul original
        List<int[]> indexedNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            indexedNums.add(new int[]{i, nums[i]}); // (0,-1), (1,-2), (2,3), (3,4) = (poz,val)
        }

        // sortez perechile in ordine crescatoare, dupa valoare --> (3,4), (2,3), (0,-1), (1,-2)
        indexedNums.sort((a, b) -> Integer.compare(b[1], a[1]));

        // selectez primele k perechi, adica perechile cu cele mai mari valori + pozitia lor in arrayul initial
        List<int[]> topK = indexedNums.subList(0, k); // k=3=> (3,4), (2,3), (0,-1)

        // sortez aceste top k perechi in functie de pozitie, ca sa le pot afisa in ordinea in care
      // erau in arrayul initial
        topK.sort(Comparator.comparingInt(a -> a[0])); // (0,-1), (2,3), (3,4)
      //construiesc array format doar din valorile ordonate dupa pozitie
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i)[1]; 
        }

        return result; // -1 3 4

    }
}
