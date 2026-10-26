package celestial;

import java.io.DataInput;

class rcc_3 implements rcv_3<rcN_2> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rcN_2 id_class(DataInput var1, int var2, rcg_3 var3) {
      var3.id_class(64L);
      return rcN_2.id_break;
   }

   @Override
   public String id_class() {
      return "END";
   }

   @Override
   public String id_break() {
      return "TAG_End";
   }
}
