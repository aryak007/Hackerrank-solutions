static void exchange(int whichPart,int a,int b)
    {
        if(whichPart==0){
            char temp;
            temp = s1[a];
            s1[a]   = s1[b];
            s1[b]   = temp;
        }
        else{
            char temp;
            temp = s2[a];
            s2[a]   = s2[b];
            s2[b]   = temp;         
        }

    }

    static int partition(int whichPart,int begin,int end){
        int i = (begin - 1);
        if(whichPart==0){
         char x = s1[begin];
            int j;
         
            for (j = begin; j <= end - 1; j++)
            {
                if(s1[j] <= x)
                {
                    i++;
                    exchange(0,i,j);
                }
            }
     
                exchange (0,i + 1, end);
            
        }
        else{
            char x = s2[begin];
                int j;
             
                for (j = begin; j <= end - 1; j++)
                {
                    if(s2[j] <= x)
                    {
                        i++;
                        exchange(1,i,j);
                    }
                }
         
                    exchange (1,i + 1, end);
        }

        
        return (i + 1);
    }

    static void quicksort(int whichPart,int begin,int end){
        int p;
        if(whichPart == 0){
            if(begin<end){
                p = partition(0,begin,end);
                quicksort(0,begin,p-1);
                quicksort(0,p+1,end);
            }
        }
        else{
            if(begin<end){
                p = partition(1,begin,end);
                quicksort(1,begin,p-1);
                quicksort(1,p+1,end);
            }
        }

        for(int k = 0;k<s1.length;k++){
            System.out.println("s1 "+s1[k]+" s2  = "+s2[k]);
        }
        
    }