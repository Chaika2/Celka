package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rcd_3 implements rcZ_2 {
   public static final Codec<rcd_3> id_class = Codec.PASSTHROUGH.comapFlatMap(var0 -> {
      rcZ_2 var1 = (rcZ_2)var0.convert(rcf_3.id_class).getValue();
      return var1 instanceof rcd_3 ? DataResult.success((rcd_3)var1) : DataResult.error("Not a compound tag: " + var1);
   }, var0 -> new Dynamic(rcf_3.id_class, var0));
   private static final Logger id_byte = LogManager.getLogger();
   private static final Pattern id_private = Pattern.compile("[A-Za-z0-9._+-]+");
   public static final rcv_3<rcd_3> id_break = new rck_3();
   private final Map<String, rcZ_2> id_implements;

   public boolean id_byte(String var1, int var2) {
      byte var3 = this.id_protected(var1);
      if (var3 == var2) {
         return true;
      } else {
         return var2 != 99 ? false : var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4 || var3 == 5 || var3 == 6;
      }
   }

   public rcZ_2 id_byte(String var1) {
      return this.id_implements.get(var1);
   }

   public rcd_3 id_int(String var1) {
      try {
         if (this.id_byte(var1, 10)) {
            return (rcd_3)this.id_implements.get(var1);
         }
      } catch (ClassCastException var3) {
         throw new KU(this.id_class(var1, id_break, var3));
      }

      return new rcd_3();
   }

   public rcd_3() {
      this(Maps.newHashMap());
   }

   protected rcd_3(Map<String, rcZ_2> var1) {
      this.id_implements = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcd_3 && Objects.equals(this.id_implements, ((rcd_3)var1).id_implements);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("{");
      Object var2 = this.id_implements.keySet();
      if (id_byte.isDebugEnabled()) {
         ArrayList var3 = Lists.newArrayList(this.id_implements.keySet());
         Collections.sort(var3);
         var2 = var3;
      }

      for (String var4 : var2) {
         if (var1.length() != 1) {
            var1.append(',');
         }

         var1.append(id_super(var4)).append(':').append(this.id_implements.get(var4));
      }

      return var1.append('}').toString();
   }

   @Override
   public int hashCode() {
      return this.id_implements.hashCode();
   }

   protected static rgP_2 id_this(String var0) {
      if (id_private.matcher(var0).matches()) {
         return new rgN_2(var0).id_class(id_protected);
      } else {
         String var1 = rca_3.id_break(var0);
         String var2 = var1.substring(0, 1);
         rVi_1 var3 = new rgN_2(var1.substring(1, var1.length() - 1)).id_class(id_protected);
         return new rgN_2(var2).id_class(var3).id_break(var2);
      }
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      for (String var3 : this.id_implements.keySet()) {
         rcZ_2 var4 = this.id_implements.get(var3);
         id_class(var3, var4, var1);
      }

      var1.writeByte(0);
   }

   @Override
   public byte id_class() {
      return 10;
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      if (this.id_implements.isEmpty()) {
         return new rgN_2("{}");
      } else {
         rgN_2 var3 = new rgN_2("{");
         Object var4 = this.id_implements.keySet();
         if (id_byte.isDebugEnabled()) {
            ArrayList var5 = Lists.newArrayList(this.id_implements.keySet());
            Collections.sort(var5);
            var4 = var5;
         }

         if (!var1.isEmpty()) {
            var3.id_break("\n");
         }

         Iterator var6 = var4.iterator();

         while (var6.hasNext()) {
            String var7 = (String)var6.next();
            rVi_1 var8 = new rgN_2(Strings.repeat(var1, var2 + 1))
               .id_class(id_this(var7))
               .id_break(String.valueOf(':'))
               .id_break(" ")
               .id_class(this.id_implements.get(var7).id_class(var1, var2 + 1));
            if (var6.hasNext()) {
               var8.id_break(String.valueOf(',')).id_break(var1.isEmpty() ? " " : "\n");
            }

            var3.id_class(var8);
         }

         if (!var1.isEmpty()) {
            var3.id_break("\n").id_break(Strings.repeat(var1, var2));
         }

         var3.id_break("}");
         return var3;
      }
   }

   public void id_class(String var1, boolean var2) {
      this.id_implements.put(var1, rch_3.id_class(var2));
   }

   static byte id_class(DataInput var0, rcg_3 var1) throws IOException {
      return var0.readByte();
   }

   private static void id_class(String var0, rcZ_2 var1, DataOutput var2) throws IOException {
      var2.writeByte(var1.id_class());
      if (var1.id_class() != 0) {
         var2.writeUTF(var0);
         var1.id_class(var2);
      }
   }

   public boolean id_class(Object var1, Set<String> var2) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rcd_3 var3) {
         for (String var5 : this.id_implements.keySet()) {
            if (!var2.contains(var5) && !this.id_implements.get(var5).equals(var3.id_implements.get(var5))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private KY id_class(String var1, rcv_3<?> var2, ClassCastException var3) {
      KY var4 = KY.id_class(var3, "Reading NBT data");
      Ko_1 var5 = var4.id_class("Corrupt NBT tag", 1);
      var5.id_class("Tag type found", () -> this.id_implements.get(var1).id_break().id_class());
      var5.id_class("Tag type expected", var2::id_class);
      var5.id_class("Tag name", var1);
      return var4;
   }

   static rcZ_2 id_class(rcv_3<?> var0, String var1, DataInput var2, int var3, rcg_3 var4) {
      try {
         return var0.id_break(var2, var3, var4);
      } catch (IOException var8) {
         KY var6 = KY.id_class(var8, "Loading NBT data");
         Ko_1 var7 = var6.id_class("NBT Tag");
         var7.id_class("Tag name", var1);
         var7.id_class("Tag type", var0.id_class());
         throw new KU(var6);
      }
   }

   public rcd_3 id_class(rcd_3 var1) {
      for (String var3 : var1.id_implements.keySet()) {
         rcZ_2 var4 = var1.id_implements.get(var3);
         if (var4.id_class() == 10) {
            if (this.id_byte(var3, 10)) {
               rcd_3 var5 = this.id_int(var3);
               var5.id_class((rcd_3)var4);
            } else {
               this.id_class(var3, var4.id_byte());
            }
         } else {
            this.id_class(var3, var4.id_byte());
         }
      }

      return this;
   }

   public void id_class(String var1, UUID var2) {
      this.id_implements.put(var1, rco_3.id_class(var2));
   }

   public void id_class(String var1, byte[] var2) {
      this.id_implements.put(var1, new rcM_2(var2));
   }

   public void id_class(String var1, long var2) {
      this.id_implements.put(var1, rct_3.id_class(var2));
   }

   public void id_class(String var1, int[] var2) {
      this.id_implements.put(var1, new rcL_2(var2));
   }

   public UUID id_class(String var1) {
      return rco_3.id_class(this.id_byte(var1));
   }

   public void id_class(String var1, String var2) {
      this.id_implements.put(var1, rca_3.id_class(var2));
   }

   public void id_class(String var1, float var2) {
      this.id_implements.put(var1, rcu_3.id_class(var2));
   }

   public void id_class(String var1, long[] var2) {
      this.id_implements.put(var1, new rcq_3(var2));
   }

   public rcZ_2 id_class(String var1, rcZ_2 var2) {
      return this.id_implements.put(var1, var2);
   }

   public void id_class(String var1, List<Integer> var2) {
      this.id_implements.put(var1, new rcL_2(var2));
   }

   public void id_class(String var1, double var2) {
      this.id_implements.put(var1, rcz_3.id_class(var2));
   }

   public void id_class(String var1, short var2) {
      this.id_implements.put(var1, rcD_2.id_class(var2));
   }

   public void id_class(String var1, byte var2) {
      this.id_implements.put(var1, rch_3.id_class(var2));
   }

   public boolean id_break(String var1) {
      rcZ_2 var2 = this.id_byte(var1);
      return var2 != null && var2.id_break() == rcL_2.id_class && ((rcL_2)var2).id_case().length == 4;
   }

   public void id_break(String var1, int var2) {
      this.id_implements.put(var1, rcn_3.id_class(var2));
   }

   static String id_break(DataInput var0, rcg_3 var1) throws IOException {
      return var0.readUTF();
   }

   @Override
   public rcv_3<rcd_3> id_break() {
      return id_break;
   }

   public void id_break(String var1, List<Long> var2) {
      this.id_implements.put(var1, new rcq_3(var2));
   }

   public boolean id_throws(String var1) {
      return this.id_implements.containsKey(var1);
   }

   public int id_throws() {
      return this.id_implements.size();
   }

   public float id_finally(String var1) {
      try {
         if (this.id_byte(var1, 99)) {
            return ((rcK_2)this.id_implements.get(var1)).id_finally();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0F;
   }

   public short id_catch(String var1) {
      try {
         if (this.id_byte(var1, 99)) {
            return ((rcK_2)this.id_implements.get(var1)).id_catch();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public rcd_3 id_catch() {
      HashMap var1 = Maps.newHashMap(Maps.transformValues(this.id_implements, rcZ_2::id_byte));
      return new rcd_3(var1);
   }

   public double id_extends(String var1) {
      try {
         if (this.id_byte(var1, 99)) {
            return ((rcK_2)this.id_implements.get(var1)).id_implements();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0;
   }

   public byte id_case(String var1) {
      try {
         if (this.id_byte(var1, 99)) {
            return ((rcK_2)this.id_implements.get(var1)).id_private();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public boolean id_case() {
      return this.id_implements.isEmpty();
   }

   public void id_continue(String var1) {
      this.id_implements.remove(var1);
   }

   public long id_implements(String var1) {
      try {
         if (this.id_byte(var1, 99)) {
            return ((rcK_2)this.id_implements.get(var1)).id_throws();
         }
      } catch (ClassCastException var3) {
      }

      return 0L;
   }

   public boolean id_new(String var1) {
      return this.id_case(var1) != 0;
   }

   public long[] id_package(String var1) {
      try {
         if (this.id_byte(var1, 12)) {
            return ((rcq_3)this.id_implements.get(var1)).id_case();
         }
      } catch (ClassCastException var3) {
         throw new KU(this.id_class(var1, rcq_3.id_class, var3));
      }

      return new long[0];
   }

   protected static String id_super(String var0) {
      return id_private.matcher(var0).matches() ? var0 : rca_3.id_break(var0);
   }

   public byte id_protected(String var1) {
      rcZ_2 var2 = this.id_implements.get(var1);
      return var2 == null ? 0 : var2.id_class();
   }

   public Set<String> id_protected() {
      return this.id_implements.keySet();
   }

   public rcy_3 id_protected(String var1, int var2) {
      try {
         if (this.id_protected(var1) == 9) {
            rcy_3 var3 = (rcy_3)this.id_implements.get(var1);
            if (!var3.isEmpty() && var3.id_throws() != var2) {
               return new rcy_3();
            }

            return var3;
         }
      } catch (ClassCastException var4) {
         throw new KU(this.id_class(var1, rcy_3.id_class, var4));
      }

      return new rcy_3();
   }

   public int id_private(String var1) {
      try {
         if (this.id_byte(var1, 99)) {
            return ((rcK_2)this.id_implements.get(var1)).id_case();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   protected Map<String, rcZ_2> id_private() {
      return Collections.unmodifiableMap(this.id_implements);
   }

   public int[] id_final(String var1) {
      try {
         if (this.id_byte(var1, 11)) {
            return ((rcL_2)this.id_implements.get(var1)).id_case();
         }
      } catch (ClassCastException var3) {
         throw new KU(this.id_class(var1, rcL_2.id_class, var3));
      }

      return new int[0];
   }

   public byte[] id_volatile(String var1) {
      try {
         if (this.id_byte(var1, 7)) {
            return ((rcM_2)this.id_implements.get(var1)).id_protected();
         }
      } catch (ClassCastException var3) {
         throw new KU(this.id_class(var1, rcM_2.id_class, var3));
      }

      return new byte[0];
   }

   public String id_native(String var1) {
      try {
         if (this.id_byte(var1, 8)) {
            return this.id_implements.get(var1).id_native();
         }
      } catch (ClassCastException var3) {
      }

      return "";
   }
}
