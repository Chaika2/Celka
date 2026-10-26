package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class rcy_3 extends rcx_3<rcZ_2> {
   public static final rcv_3<rcy_3> id_class = new rcp_3();
   private static final ByteSet id_break = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private final List<rcZ_2> id_byte;
   private byte id_private;

   @Override
   public rcZ_2 id_byte(int var1) {
      rcZ_2 var2 = this.id_byte.remove(var1);
      this.id_case();
      return var2;
   }

   @Override
   public void id_byte(int var1, rcZ_2 var2) {
      if (!this.id_break(var1, var2)) {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.id_class(), this.id_private));
      }
   }

   rcy_3(List<rcZ_2> var1, byte var2) {
      this.id_byte = var1;
      this.id_private = var2;
   }

   public rcy_3() {
      this(Lists.newArrayList(), (byte)0);
   }

   @Override
   public int size() {
      return this.id_byte.size();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcy_3 && Objects.equals(this.id_byte, ((rcy_3)var1).id_byte);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[");

      for (int var2 = 0; var2 < this.id_byte.size(); var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.id_byte.get(var2));
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return this.id_byte.hashCode();
   }

   @Override
   public void clear() {
      this.id_byte.clear();
      this.id_private = 0;
   }

   @Override
   public boolean isEmpty() {
      return this.id_byte.isEmpty();
   }

   @Override
   public byte id_class() {
      return 9;
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      if (this.isEmpty()) {
         return new rgN_2("[]");
      } else if (id_break.contains(this.id_private) && this.size() <= 8) {
         String var7 = ", ";
         rgN_2 var8 = new rgN_2("[");

         for (int var9 = 0; var9 < this.id_byte.size(); var9++) {
            if (var9 != 0) {
               var8.id_break(", ");
            }

            var8.id_class(this.id_byte.get(var9).id_volatile());
         }

         var8.id_break("]");
         return var8;
      } else {
         rgN_2 var3 = new rgN_2("[");
         if (!var1.isEmpty()) {
            var3.id_break("\n");
         }

         String var4 = String.valueOf(',');

         for (int var5 = 0; var5 < this.id_byte.size(); var5++) {
            rgN_2 var6 = new rgN_2(Strings.repeat(var1, var2 + 1));
            var6.id_class(this.id_byte.get(var5).id_class(var1, var2 + 1));
            if (var5 != this.id_byte.size() - 1) {
               var6.id_break(var4).id_break(var1.isEmpty() ? " " : "\n");
            }

            var3.id_class(var6);
         }

         if (!var1.isEmpty()) {
            var3.id_break("\n").id_break(Strings.repeat(var1, var2));
         }

         var3.id_break("]");
         return var3;
      }
   }

   @Override
   public boolean id_class(int var1, rcZ_2 var2) {
      if (this.id_class(var2)) {
         this.id_byte.set(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   private boolean id_class(rcZ_2 var1) {
      if (var1.id_class() == 0) {
         return false;
      } else if (this.id_private == 0) {
         this.id_private = var1.id_class();
         return true;
      } else {
         return this.id_private == var1.id_class();
      }
   }

   public rcd_3 id_class(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         if (var2.id_class() == 10) {
            return (rcd_3)var2;
         }
      }

      return new rcd_3();
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      if (this.id_byte.isEmpty()) {
         this.id_private = 0;
      } else {
         this.id_private = this.id_byte.get(0).id_class();
      }

      var1.writeByte(this.id_private);
      var1.writeInt(this.id_byte.size());

      for (rcZ_2 var3 : this.id_byte) {
         var3.id_class(var1);
      }
   }

   public rcy_3 id_break(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         if (var2.id_class() == 9) {
            return (rcy_3)var2;
         }
      }

      return new rcy_3();
   }

   @Override
   public rcv_3<rcy_3> id_break() {
      return id_class;
   }

   @Override
   public boolean id_break(int var1, rcZ_2 var2) {
      if (this.id_class(var2)) {
         this.id_byte.add(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public byte id_throws() {
      return this.id_private;
   }

   public int id_throws(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         if (var2.id_class() == 3) {
            return ((rcn_3)var2).id_case();
         }
      }

      return 0;
   }

   public rcZ_2 id_finally(int var1) {
      return this.id_byte.get(var1);
   }

   public double id_catch(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         if (var2.id_class() == 6) {
            return ((rcz_3)var2).id_implements();
         }
      }

      return 0.0;
   }

   private void id_case() {
      if (this.id_byte.isEmpty()) {
         this.id_private = 0;
      }
   }

   public int[] id_case(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         if (var2.id_class() == 11) {
            return ((rcL_2)var2).id_case();
         }
      }

      return new int[0];
   }

   public String id_implements(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         return var2.id_class() == 8 ? var2.id_native() : var2.toString();
      } else {
         return "";
      }
   }

   public short id_protected(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         if (var2.id_class() == 2) {
            return ((rcD_2)var2).id_catch();
         }
      }

      return 0;
   }

   public rcy_3 id_protected() {
      Object var1 = rcY_2.id_class(this.id_private).id_byte() ? this.id_byte : Iterables.transform(this.id_byte, rcZ_2::id_byte);
      ArrayList var2 = Lists.newArrayList((Iterable)var1);
      return new rcy_3(var2, this.id_private);
   }

   @Override
   public rcZ_2 id_protected(int var1, rcZ_2 var2) {
      rcZ_2 var3 = this.id_finally(var1);
      if (!this.id_class(var1, var2)) {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.id_class(), this.id_private));
      } else {
         return var3;
      }
   }

   public float id_private(int var1) {
      if (var1 >= 0 && var1 < this.id_byte.size()) {
         rcZ_2 var2 = this.id_byte.get(var1);
         if (var2.id_class() == 5) {
            return ((rcu_3)var2).id_finally();
         }
      }

      return 0.0F;
   }
}
