/*
 * dollar.h
 *
 *  Created on: 2011/03/15
 *      Author: Masaki
 */

#ifndef DOLLAR_H_
#define DOLLAR_H_
#include <stdbool.h>

typedef struct {
} Dollar;

Dollar *create_dollar( unsigned int amount );
bool equal( const Dollar *dollar, const void *other );
Dollar *multiply( const Dollar *dollar, unsigned int multiplier );

#endif /* DOLLAR_H_ */
