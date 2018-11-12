#include "stdio.h"
enum WEEKDAY{SUNDAY,MONDAY,TUESDAY,WENDNESDAY,THURSDAY,SATURDAY};

void main(){
	enum WEEKDAY monday=MONDAY;
	/* output: monday=1 */
	printf("monday=%d\n",monday);
}
