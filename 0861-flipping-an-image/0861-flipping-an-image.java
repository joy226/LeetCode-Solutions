class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] pixels: image) {
			// reverse this pixels
			for(int i = 0; i < (image[0].length + 1) / 2; i++){
				// swap
				int temp = pixels[i]^1; // to do complement we are doing XOR over hare
				pixels[i] = pixels[image[0].length - i - 1]^1;
				pixels[image[0].length - i - 1] = temp;
			}
		}
		return image;
    }
}