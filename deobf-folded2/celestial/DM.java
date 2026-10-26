package celestial;

import java.util.function.Function;

class DM {
   private final Do_1 id_break;
   private rqO_2 id_byte;

   public DM id_byte(xd_3 var1) {
      rqO_2 var2 = Uh_1.id_super.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var3 = Uh_1.id_this.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_byte(var1, var2, var3));
      rqO_2 var4 = Uh_1.id_else.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class(var1, var4);
      return this;
   }

   public DM(DG var1, Do_1 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public DM id_class(xd_3 var1, xd_3 var2) {
      rqO_2 var3 = Uh_1.id_abstract.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_byte(var1, var3));
      this.id_class.id_class.accept(DG.id_byte(var2, var3));
      this.id_class.id_class(var1.id_case());
      this.id_class.id_class(var2);
      return this;
   }

   public DM id_class(xd_3 var1, DD var2) {
      this.id_byte = var2.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_byte(var1, this.id_byte));
      return this;
   }

   public DM id_class(Function<Do_1, rqO_2> var1) {
      this.id_byte = (rqO_2)var1.apply(this.id_break);
      return this;
   }

   public DM id_class(xd_3 var1) {
      rqO_2 var2 = Uh_1.id_native.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var3 = Uh_1.id_volatile.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_break(var1, var2, var3));
      rqO_2 var4 = Uh_1.id_final.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class(var1, var4);
      return this;
   }

   public DM id_break(xd_3 var1) {
      rqO_2 var2 = Uh_1.id_synchronized.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var3 = Uh_1.id_return.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var4 = Uh_1.id_public.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_class(var1, var2, var3, var4));
      rqO_2 var5 = Uh_1.id_goto.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class(var1, var5);
      return this;
   }

   public DM id_throws(xd_3 var1) {
      rqO_2 var2 = Uh_1.id_interface.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var3 = Uh_1.id_char.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_throws(var1, var2, var3));
      return this;
   }

   public DM id_catch(xd_3 var1) {
      rqO_2 var2 = Uh_1.id_import.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var3 = Uh_1.id_static.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var4 = Uh_1.id_short.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_break(var1, var2, var3, var4));
      return this;
   }

   public DM id_case(xd_3 var1) {
      if (this.id_byte == null) {
         throw new IllegalStateException("Full block not generated yet");
      } else {
         rqO_2 var2 = Uh_1.id_long.id_class(var1, this.id_break, this.id_class.id_break);
         rqO_2 var3 = Uh_1.id_float.id_class(var1, this.id_break, this.id_class.id_break);
         this.id_class.id_class.accept(DG.id_throws(var1, var2, var3, this.id_byte));
         return this;
      }
   }

   public DM id_protected(xd_3 var1) {
      rqO_2 var2 = Uh_1.id_try.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var3 = Uh_1.id_while.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var4 = Uh_1.id_throw.id_class(var1, this.id_break, this.id_class.id_break);
      rqO_2 var5 = Uh_1.id_instanceof.id_class(var1, this.id_break, this.id_class.id_break);
      this.id_class.id_class.accept(DG.id_break(var1, var2, var3, var4, var5));
      return this;
   }
}
