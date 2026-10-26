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
   public static final Codec<rcd_3> class_ = Codec.PASSTHROUGH.comapFlatMap(var0 -> {
      rcZ_2 var1 = (rcZ_2)var0.convert(rcf_3.class_).getValue();
      return var1 instanceof rcd_3 ? DataResult.success((rcd_3)var1) : DataResult.error("Not a compound tag: " + var1);
   }, var0 -> new Dynamic(rcf_3.class_, var0));
   private static final Logger byte_ = LogManager.getLogger();
   private static final Pattern private_ = Pattern.compile("[A-Za-z0-9._+-]+");
   public static final rcv_3<rcd_3> break_ = new rck_3();
   private final Map<String, rcZ_2> implements_;

   public boolean byte_(String var1, int var2) {
      byte var3 = this.protected_(var1);
      if (var3 == var2) {
         return true;
      } else {
         return var2 != 99 ? false : var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4 || var3 == 5 || var3 == 6;
      }
   }

   public rcZ_2 byte_(String var1) {
      return this.implements_.get(var1);
   }

   public rcd_3 int_(String var1) {
      try {
         if (this.byte_(var1, 10)) {
            return (rcd_3)this.implements_.get(var1);
         }
      } catch (ClassCastException var3) {
         throw new KU(this.class_(var1, break_, var3));
      }

      return new rcd_3();
   }

   public rcd_3() {
      this(Maps.newHashMap());
   }

   protected rcd_3(Map<String, rcZ_2> var1) {
      this.implements_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcd_3 && Objects.equals(this.implements_, ((rcd_3)var1).implements_);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("{");
      Object var2 = this.implements_.keySet();
      if (byte_.isDebugEnabled()) {
         ArrayList var3 = Lists.newArrayList(this.implements_.keySet());
         Collections.sort(var3);
         var2 = var3;
      }

      for (String var4 : var2) {
         if (var1.length() != 1) {
            var1.append(',');
         }

         var1.append(super_(var4)).append(':').append(this.implements_.get(var4));
      }

      return var1.append('}').toString();
   }

   @Override
   public int hashCode() {
      return this.implements_.hashCode();
   }

   protected static rgP_2 this_(String var0) {
      if (private_.matcher(var0).matches()) {
         return new rgN_2(var0).class_(protected_);
      } else {
         String var1 = rca_3.break_(var0);
         String var2 = var1.substring(0, 1);
         rVi_1 var3 = new rgN_2(var1.substring(1, var1.length() - 1)).class_(protected_);
         return new rgN_2(var2).class_(var3).break_(var2);
      }
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      for (String var3 : this.implements_.keySet()) {
         rcZ_2 var4 = this.implements_.get(var3);
         class_(var3, var4, var1);
      }

      var1.writeByte(0);
   }

   @Override
   public byte class_() {
      return 10;
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      if (this.implements_.isEmpty()) {
         return new rgN_2("{}");
      } else {
         rgN_2 var3 = new rgN_2("{");
         Object var4 = this.implements_.keySet();
         if (byte_.isDebugEnabled()) {
            ArrayList var5 = Lists.newArrayList(this.implements_.keySet());
            Collections.sort(var5);
            var4 = var5;
         }

         if (!var1.isEmpty()) {
            var3.break_("\n");
         }

         Iterator var6 = var4.iterator();

         while (var6.hasNext()) {
            String var7 = (String)var6.next();
            rVi_1 var8 = new rgN_2(Strings.repeat(var1, var2 + 1))
               .class_(this_(var7))
               .break_(String.valueOf(':'))
               .break_(" ")
               .class_(this.implements_.get(var7).class_(var1, var2 + 1));
            if (var6.hasNext()) {
               var8.break_(String.valueOf(',')).break_(var1.isEmpty() ? " " : "\n");
            }

            var3.class_(var8);
         }

         if (!var1.isEmpty()) {
            var3.break_("\n").break_(Strings.repeat(var1, var2));
         }

         var3.break_("}");
         return var3;
      }
   }

   public void class_(String var1, boolean var2) {
      this.implements_.put(var1, rch_3.class_(var2));
   }

   static byte class_(DataInput var0, rcg_3 var1) throws IOException {
      return var0.readByte();
   }

   private static void class_(String var0, rcZ_2 var1, DataOutput var2) throws IOException {
      var2.writeByte(var1.class_());
      if (var1.class_() != 0) {
         var2.writeUTF(var0);
         var1.class_(var2);
      }
   }

   public boolean class_(Object var1, Set<String> var2) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rcd_3 var3) {
         for (String var5 : this.implements_.keySet()) {
            if (!var2.contains(var5) && !this.implements_.get(var5).equals(var3.implements_.get(var5))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private KY class_(String var1, rcv_3<?> var2, ClassCastException var3) {
      KY var4 = KY.class_(var3, "Reading NBT data");
      Ko_1 var5 = var4.class_("Corrupt NBT tag", 1);
      var5.class_("Tag type found", () -> this.implements_.get(var1).break_().class_());
      var5.class_("Tag type expected", var2::class_);
      var5.class_("Tag name", var1);
      return var4;
   }

   static rcZ_2 class_(rcv_3<?> var0, String var1, DataInput var2, int var3, rcg_3 var4) {
      try {
         return var0.break_(var2, var3, var4);
      } catch (IOException var8) {
         KY var6 = KY.class_(var8, "Loading NBT data");
         Ko_1 var7 = var6.class_("NBT Tag");
         var7.class_("Tag name", var1);
         var7.class_("Tag type", var0.class_());
         throw new KU(var6);
      }
   }

   public rcd_3 class_(rcd_3 var1) {
      for (String var3 : var1.implements_.keySet()) {
         rcZ_2 var4 = var1.implements_.get(var3);
         if (var4.class_() == 10) {
            if (this.byte_(var3, 10)) {
               rcd_3 var5 = this.int_(var3);
               var5.class_((rcd_3)var4);
            } else {
               this.class_(var3, var4.byte_());
            }
         } else {
            this.class_(var3, var4.byte_());
         }
      }

      return this;
   }

   public void class_(String var1, UUID var2) {
      this.implements_.put(var1, rco_3.class_(var2));
   }

   public void class_(String var1, byte[] var2) {
      this.implements_.put(var1, new rcM_2(var2));
   }

   public void class_(String var1, long var2) {
      this.implements_.put(var1, rct_3.class_(var2));
   }

   public void class_(String var1, int[] var2) {
      this.implements_.put(var1, new rcL_2(var2));
   }

   public UUID class_(String var1) {
      return rco_3.class_(this.byte_(var1));
   }

   public void class_(String var1, String var2) {
      this.implements_.put(var1, rca_3.class_(var2));
   }

   public void class_(String var1, float var2) {
      this.implements_.put(var1, rcu_3.class_(var2));
   }

   public void class_(String var1, long[] var2) {
      this.implements_.put(var1, new rcq_3(var2));
   }

   public rcZ_2 class_(String var1, rcZ_2 var2) {
      return this.implements_.put(var1, var2);
   }

   public void class_(String var1, List<Integer> var2) {
      this.implements_.put(var1, new rcL_2(var2));
   }

   public void class_(String var1, double var2) {
      this.implements_.put(var1, rcz_3.class_(var2));
   }

   public void class_(String var1, short var2) {
      this.implements_.put(var1, rcD_2.class_(var2));
   }

   public void class_(String var1, byte var2) {
      this.implements_.put(var1, rch_3.class_(var2));
   }

   public boolean break_(String var1) {
      rcZ_2 var2 = this.byte_(var1);
      return var2 != null && var2.break_() == rcL_2.class_ && ((rcL_2)var2).case_().length == 4;
   }

   public void break_(String var1, int var2) {
      this.implements_.put(var1, rcn_3.class_(var2));
   }

   static String break_(DataInput var0, rcg_3 var1) throws IOException {
      return var0.readUTF();
   }

   @Override
   public rcv_3<rcd_3> break_() {
      return break_;
   }

   public void break_(String var1, List<Long> var2) {
      this.implements_.put(var1, new rcq_3(var2));
   }

   public boolean throws_(String var1) {
      return this.implements_.containsKey(var1);
   }

   public int throws_() {
      return this.implements_.size();
   }

   public float finally_(String var1) {
      try {
         if (this.byte_(var1, 99)) {
            return ((rcK_2)this.implements_.get(var1)).finally_();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0F;
   }

   public short catch_(String var1) {
      try {
         if (this.byte_(var1, 99)) {
            return ((rcK_2)this.implements_.get(var1)).catch_();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public rcd_3 catch_() {
      HashMap var1 = Maps.newHashMap(Maps.transformValues(this.implements_, rcZ_2::byte_));
      return new rcd_3(var1);
   }

   public double extends_(String var1) {
      try {
         if (this.byte_(var1, 99)) {
            return ((rcK_2)this.implements_.get(var1)).implements_();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0;
   }

   public byte case_(String var1) {
      try {
         if (this.byte_(var1, 99)) {
            return ((rcK_2)this.implements_.get(var1)).private_();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public boolean case_() {
      return this.implements_.isEmpty();
   }

   public void continue_(String var1) {
      this.implements_.remove(var1);
   }

   public long implements_(String var1) {
      try {
         if (this.byte_(var1, 99)) {
            return ((rcK_2)this.implements_.get(var1)).throws_();
         }
      } catch (ClassCastException var3) {
      }

      return 0L;
   }

   public boolean new_(String var1) {
      return this.case_(var1) != 0;
   }

   public long[] package_(String var1) {
      try {
         if (this.byte_(var1, 12)) {
            return ((rcq_3)this.implements_.get(var1)).case_();
         }
      } catch (ClassCastException var3) {
         throw new KU(this.class_(var1, rcq_3.class_, var3));
      }

      return new long[0];
   }

   protected static String super_(String var0) {
      return private_.matcher(var0).matches() ? var0 : rca_3.break_(var0);
   }

   public byte protected_(String var1) {
      rcZ_2 var2 = this.implements_.get(var1);
      return var2 == null ? 0 : var2.class_();
   }

   public Set<String> protected_() {
      return this.implements_.keySet();
   }

   public rcy_3 protected_(String var1, int var2) {
      try {
         if (this.protected_(var1) == 9) {
            rcy_3 var3 = (rcy_3)this.implements_.get(var1);
            if (!var3.isEmpty() && var3.throws_() != var2) {
               return new rcy_3();
            }

            return var3;
         }
      } catch (ClassCastException var4) {
         throw new KU(this.class_(var1, rcy_3.class_, var4));
      }

      return new rcy_3();
   }

   public int private_(String var1) {
      try {
         if (this.byte_(var1, 99)) {
            return ((rcK_2)this.implements_.get(var1)).case_();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   protected Map<String, rcZ_2> private_() {
      return Collections.unmodifiableMap(this.implements_);
   }

   public int[] final_(String var1) {
      try {
         if (this.byte_(var1, 11)) {
            return ((rcL_2)this.implements_.get(var1)).case_();
         }
      } catch (ClassCastException var3) {
         throw new KU(this.class_(var1, rcL_2.class_, var3));
      }

      return new int[0];
   }

   public byte[] volatile_(String var1) {
      try {
         if (this.byte_(var1, 7)) {
            return ((rcM_2)this.implements_.get(var1)).protected_();
         }
      } catch (ClassCastException var3) {
         throw new KU(this.class_(var1, rcM_2.class_, var3));
      }

      return new byte[0];
   }

   public String native_(String var1) {
      try {
         if (this.byte_(var1, 8)) {
            return this.implements_.get(var1).native_();
         }
      } catch (ClassCastException var3) {
      }

      return "";
   }
}
