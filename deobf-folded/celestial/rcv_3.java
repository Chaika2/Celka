package celestial;

import java.io.DataInput;
import java.io.IOException;

public interface rcv_3<T extends rcZ_2> {
   default boolean id_byte() {
      return false;
   }

   static rcv_3<rcN_2> id_class(int var0) {
      return new rcF_2(var0);
   }

   String id_class();

   String id_break();

   T id_break(DataInput var1, int var2, rcg_3 var3) throws IOException;
}
