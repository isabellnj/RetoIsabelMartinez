package com.example.RetoIsabelMS.MODEL;

public class Order {
    
    public Order(){}


    public enum estados {
        ONE {
            public String toString() {
                return "EN CURSO";
            }
        },
      
        TWO {
            public String toString() {
                return "ACEPTADO";
            }
        },
        THREE{
            public String toString() {
                return "ENVIADO";
            }
        },

        FOR {
            public String toString() {
                return "ENTREGADO";
            }
        },
        SIX {
            public String toString() {
                return "CANCELADO";
            }
        }

      }

    private static int count=0;
    private int id; 
    private String Date; 
    private int Name; 
    private String State;
     
    

    public Order(final int _id,final String _date, final int _name, final String _state){
        this.id = count++;
        this.Date = _date; 
        this.Name = _name; 
        this.State = _state;


    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getName() {
        return Name;
    }

    public void setName(int name) {
        Name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    



}
