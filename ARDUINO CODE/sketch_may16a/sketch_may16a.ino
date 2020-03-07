
void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(12,OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
if(Serial.available())
{
  int i=Serial.read()-'0';
  Serial.println(i);
  if(i==1)
  {
    digitalWrite(12,HIGH);
    Serial.println("ON");
  }
  if(i==0)
  {
    digitalWrite(12,LOW);
    Serial.println("OFF");
  }
}
}
