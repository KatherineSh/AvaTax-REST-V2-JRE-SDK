package net.avalara.avatax.rest.client.enums;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a type of tax override requested by the customer.
 *  
 *  AvaTax allows customers to override some behavior of the AvaTax engine. When you use a
 *  Tax Override, you can import tax that was previously calculated and charged to the customer exactly
 *  as it was charged. AvaTax will record the type of override used for each transaction.
 */
public enum TaxOverrideType {
    /** 
     * AvaTax calculated the tax for this transaction, and no override occurred.
     */
    None,

    /** 
     * AvaTax calculated tax for this transaction, but the final tax amount on the transaction was
     *  determined outside of AvaTax. To see the tax amounts determined by AvaTax, look at the
     *  `taxCalculated` field. To see the tax amounts determined by the customer's outside tax engine,
     *  look at the `taxAmount` field.
     *  
     *  This behavior can also occur when a customer requests a refund. For refunds calculated using the
     *  `RefundTransaction` API, AvaTax will ensure that the exact tax charged to the customer is refunded
     *  to the customer using a tax amount override.
     */
    TaxAmount,

    /** 
     * Entity exemption was ignored (e.g. item was consumed)
     */
    Exemption,

    /** 
     * AvaTax was instructed to calculate this transaction using the tax rules that were in effect
     *  on a different day than the transaction occurred. 
     *  
     *  This behavior typically occurs during refunds. If the customer attempts to return a product
     *  without a receipt that shows the exact tax amount paid, AvaTax can calculate tax on the date
     *  when they believed that the product was purchased.
     */
    TaxDate,

    /** 
     * To support Consumer Use Tax
     */
    AccruedTaxAmount,

    /** 
     * Derive the taxable amount from the tax amount
     */
    DeriveTaxable,

}
    