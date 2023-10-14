package com.arrays.practice;

public class MultiDimensionArray {

	public static void main(String[] args) {

		// first formula
		byte[][][] numbers = new byte[3][4][5];
		
		numbers[0][0][0] = 12;
		numbers[0][0][1] = 13;


		// second formula

		byte[][][] numbers1 = {

				{ 
					{ 12, 13, 14, 15, 16 }, 
					{ 17, 18, 19, 20, 21 }, 
					{ 22, 23, 24, 25, 26 },
					{ 27, 28, 29, 30, 31 },
					

				},
				{ 
					{ 12, 13, 14, 15, 16 }, 
					{ 17, 18, 19, 20, 21 }, 
					{ 22, 23, 24, 25, 26 },
					{ 27, 28, 29, 30, 31 },
			

				},
				{ 
					{ 12, 13, 14, 15, 16 }, 
					{ 17, 18, 19, 20, 21 }, 
					{ 22, 23, 24, 25, 26 },
					{ 27, 28, 29, 30, 31 },
				},

			};
		
		for (int x = 0; x < numbers1.length; x++) {
			for (int y = 0; y < numbers1[x].length; y++) {
				for (int z = 0; z < numbers1[x][y].length; z++) {
					
					System.out.print(numbers1[x][y][z]);
					
				}
			}
		}
		
	}

}
