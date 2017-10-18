# sample-classes

# This is how rtaxi object sent to PaymentException

String statusCode = rtaxi.getStatus().getCode();
String statusMessage = rtaxi.getStatus().getMessage();
           
            
            
if (statusCode.equals("400")) {
                throw new PaymentException(statusCode).setData(rtaxi);
}
