public class nilaiMahasiswa {

    int highest(int arr[], int left, int right){
        if(left == right){
            return arr[left];
        }

        int mid = (left + right) / 2;

        int lmax = highest(arr, left, mid);
        int rmax = highest(arr, mid+1, right);

        if(lmax > rmax){
            return lmax;
        } else{
            return rmax;
        }
    }

    int lowest(int arr[], int left, int right){
        if(left == right){
            return arr[left];
        }

        int mid = (left + right) / 2;

        int lmin = lowest(arr, left, mid);
        int rmin = lowest(arr, mid+1, right);

        if(lmin < rmin){
            return lmin;
        } else{
            return rmin;
        }
    }

    double rataUAS(int arr[]){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return (double) total / arr.length;
    }
}