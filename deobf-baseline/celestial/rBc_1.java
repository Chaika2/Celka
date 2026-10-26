package celestial;

import java.util.EnumSet;

public class rBc_1 extends rSM {
   private static final ay_3 id_class = new ay_3().id_byte().id_throws();
   private boolean id_break;
   private int id_byte;
   private final Class<?>[] id_protected;
   private Class<?>[] id_implements;

   @Override
   public void id_byte() {
      this.id_throws.id_byte(this.id_throws.Sr());
      this.id_catch = this.id_throws.I_();
      this.id_byte = this.id_throws.Sb();
      this.id_private = 300;
      if (this.id_break) {
         this.id_catch();
      }

      super.id_byte();
   }

   public rBc_1(aA_2 var1, Class<?>... var2) {
      super(var1, true);
      this.id_protected = var2;
      this.id_class(EnumSet.of(rBW.TARGET));
   }

   protected void id_class(is_3 var1, iB_2 var2) {
      var1.id_byte(var2);
   }

   public rBc_1 id_class(Class<?>... var1) {
      this.id_break = true;
      this.id_implements = var1;
      return this;
   }

   @Override
   public boolean id_class() {
      int var1 = this.id_throws.Sb();
      iB_2 var2 = this.id_throws.Sr();
      if (var1 != this.id_byte && var2 != null) {
         if (var2.BC() == aI_2.rM && ((rYB)this.id_throws.id_throws[7]).B().id_break(rRu_1.id_long)) {
            return false;
         } else {
            for (Class var6 : this.id_protected) {
               if (var6.isAssignableFrom(var2.getClass())) {
                  return false;
               }
            }

            return this.id_class(var2, id_class);
         }
      } else {
         return false;
      }
   }

   protected void id_catch() {
      double var1 = this.id_extends();
      rfl_3 var3 = rfl_3.id_class(this.id_throws.Ps()).id_byte(var1, 10.0, var1);

      label56:
      for (is_3 var6 : ((rYB)this.id_throws.id_throws[7]).id_break(this.id_throws.getClass(), var3)) {
         if (this.id_throws != var6
            && var6.I_() == null
            && (!(this.id_throws instanceof rOQ) || ((rOQ)this.id_throws).sF() == ((rOQ)var6).sF())
            && !var6.id_final(this.id_throws.Sr())) {
            if (this.id_implements != null) {
               boolean var7 = false;
               Class[] var8 = this.id_implements;
               int var9 = var8.length;
               int var10 = 0;

               while (true) {
                  if (var10 < var9) {
                     Class var11 = var8[var10];
                     if (var6.getClass() != var11) {
                        var10++;
                        continue;
                     }

                     var7 = true;
                  }

                  if (!var7) {
                     break;
                  }
                  continue label56;
               }
            }

            this.id_class(var6, this.id_throws.Sr());
         }
      }
   }
}
