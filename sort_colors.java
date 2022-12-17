public void sortColors(int[] nums) {
        int left=0,right=nums.length-1;
        for(int i=0;i<2;i++)
              left=sortColorsCore(nums,left,right,i); //left means the index in next loop     
        for(int i=0;i=0&&nums[right]!=target)
	        		right--;
	        	if(left<=right){
		        	int temp=nums[left];
		        	nums[left]=nums[right];
		        	nums[right]=temp;
	        	}
	        }
		 return left;
	}
