package celestial;

import java.io.DataOutput;
import java.io.IOException;

public interface rcZ_2 {
   rgF_2 protected_ = rgF_2.AQUA;
   rgF_2 throws_ = rgF_2.GREEN;
   rgF_2 case_ = rgF_2.GOLD;
   rgF_2 catch_ = rgF_2.RED;

   rcZ_2 byte_();

   @Override
   String toString();

   void class_(DataOutput var1) throws IOException;

   rgP_2 class_(String var1, int var2);

   byte class_();

   rcv_3<?> break_();

   default rgP_2 volatile_() {
      return this.class_("", 0);
   }

   default String native_() {
      return this.toString();
   }
}
