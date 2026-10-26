package celestial;

public class rJv_1 extends rJr_1 {
   private final rXu_1 id_class;
   private final rpF_2 id_break;

   public rJv_1(int var1) {
      this(var1, new rXA(1), new rpI_2(1));
   }

   public rJv_1(int var1, rXu_1 var2, rpF_2 var3) {
      super(rJP.id_new, var1);
      id_class(var2, 1);
      id_class(var3, 1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_break(new rJF(this, var2, 0, 0, 0));
      this.id_class(var3);
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return this.id_class.id_byte(var1);
   }

   public rdn_3 id_class() {
      return this.id_class.id_extends(0);
   }

   @Override
   public void id_class(int var1, int var2) {
      super.id_class(var1, var2);
      this.id_native();
   }

   @Override
   public boolean id_break(rhd_3 var1, int var2) {
      if (var2 >= 100) {
         int var6 = var2 - 100;
         this.id_class(0, var6);
         return true;
      } else {
         switch (var2) {
            case 1:
               int var3 = this.id_break.id_class(0);
               this.id_class(0, var3 - 1);
               return true;
            case 2:
               int var4 = this.id_break.id_class(0);
               this.id_class(0, var4 + 1);
               return true;
            case 3:
               if (!var1.sD()) {
                  return false;
               }

               rdn_3 var5 = this.id_class.id_native(0);
               this.id_class.id_break();
               if (!((rhz_3)var1.id_implements[1]).id_throws(var5)) {
                  var1.id_class(var5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   public int id_break() {
      return this.id_break.id_class(0);
   }
}
