#!/bin/bash

#Program that counts down to zero from a given argument
# chmod +x counter.sh  -- for grant execute access and chmod -x counter.sh  -- for revoke execute access
# ./counter.sh - for executing script
# man <command> -- to find manual 
 
 echo -e "\n~~~Countdown Timer~~~\n"

if [[ $1 -ge 0 ]] # $1 used to take first argument as input from CLI .if [[_ _operator_ _]] -lt=less than,-le=less than or equal,-eq=equal,-gt,-ge
then 
   : 'for(( i = $1; i >= 0 ; i-- ))
      do 
         echo $i
         sleep 1
   done
   '
   I=$1
  while [[ $I -ge 0 ]]
        do 
          echo $I
          (( I-- ))
          sleep 1
          
    done
else
   echo Include a positive integer as the first argument.
fi #if statement end



# [[ -x questionnare.sh || 5 -le 4 ]]; echo $?  --  run from to check directly from cli
#echo $?   --  to print exit status 0 if true and 1 if false