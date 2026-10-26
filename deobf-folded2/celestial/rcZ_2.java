package celestial;

import java.io.DataOutput;
import java.io.IOException;

public interface rcZ_2 {
   rgF_2 id_protected = rgF_2.AQUA;
   rgF_2 id_throws = rgF_2.GREEN;
   rgF_2 id_case = rgF_2.GOLD;
   rgF_2 id_catch = rgF_2.RED;

   rcZ_2 id_byte();

   @Override
   String toString();

   void id_class(DataOutput var1) throws IOException;

   rgP_2 id_class(String var1, int var2);

   byte id_class();

   rcv_3<?> id_break();

   default rgP_2 id_volatile() {
      return this.id_class("", 0);
   }

   default String id_native() {
      return this.toString();
   }
}
