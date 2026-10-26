package celestial;

import java.io.IOException;

public class rFw_1 implements ruS_2<At_1> {
   private rFf_1 id_class;
   private int id_break;
   private double id_byte;
   private double id_protected;
   private double id_throws;
   private double id_case;
   private long id_catch;
   private int id_private;
   private int id_implements;

   public rFw_1() {
   }

   public rFw_1(roE_2 var1, rFf_1 var2) {
      this.id_class = var2;
      this.id_byte = var1.id_class();
      this.id_protected = var1.id_break();
      this.id_case = var1.id_implements();
      this.id_throws = var1.id_extends();
      this.id_catch = var1.id_finally();
      this.id_break = var1.id_volatile();
      this.id_implements = var1.id_continue();
      this.id_private = var1.id_new();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void id_class(roE_2 var1) {
      switch (this.id_class) {
         case SET_SIZE:
            var1.id_class(this.id_throws);
            break;
         case LERP_SIZE:
            var1.id_class(this.id_case, this.id_throws, this.id_catch);
            break;
         case SET_CENTER:
            var1.id_break(this.id_byte, this.id_protected);
            break;
         case SET_WARNING_BLOCKS:
            var1.id_byte(this.id_implements);
            break;
         case SET_WARNING_TIME:
            var1.id_break(this.id_private);
            break;
         case INITIALIZE:
            var1.id_break(this.id_byte, this.id_protected);
            if (this.id_catch > 0L) {
               var1.id_class(this.id_case, this.id_throws, this.id_catch);
            } else {
               var1.id_class(this.id_throws);
            }

            var1.id_class(this.id_break);
            var1.id_byte(this.id_implements);
            var1.id_break(this.id_private);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class(rFf_1.class);
      switch (this.id_class) {
         case SET_SIZE:
            this.id_throws = var1.readDouble();
            break;
         case LERP_SIZE:
            this.id_case = var1.readDouble();
            this.id_throws = var1.readDouble();
            this.id_catch = var1.id_catch();
            break;
         case SET_CENTER:
            this.id_byte = var1.readDouble();
            this.id_protected = var1.readDouble();
            break;
         case SET_WARNING_BLOCKS:
            this.id_implements = var1.id_case();
            break;
         case SET_WARNING_TIME:
            this.id_private = var1.id_case();
            break;
         case INITIALIZE:
            this.id_byte = var1.readDouble();
            this.id_protected = var1.readDouble();
            this.id_case = var1.readDouble();
            this.id_throws = var1.readDouble();
            this.id_catch = var1.id_catch();
            this.id_break = var1.id_case();
            this.id_implements = var1.id_case();
            this.id_private = var1.id_case();
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      switch (this.id_class) {
         case SET_SIZE:
            var1.writeDouble(this.id_throws);
            break;
         case LERP_SIZE:
            var1.writeDouble(this.id_case);
            var1.writeDouble(this.id_throws);
            var1.id_class(this.id_catch);
            break;
         case SET_CENTER:
            var1.writeDouble(this.id_byte);
            var1.writeDouble(this.id_protected);
            break;
         case SET_WARNING_BLOCKS:
            var1.id_protected(this.id_implements);
            break;
         case SET_WARNING_TIME:
            var1.id_protected(this.id_private);
            break;
         case INITIALIZE:
            var1.writeDouble(this.id_byte);
            var1.writeDouble(this.id_protected);
            var1.writeDouble(this.id_case);
            var1.writeDouble(this.id_throws);
            var1.id_class(this.id_catch);
            var1.id_protected(this.id_break);
            var1.id_protected(this.id_implements);
            var1.id_protected(this.id_private);
      }
   }
}
