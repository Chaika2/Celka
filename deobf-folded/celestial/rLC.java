package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class rLC {
   private final List<rLq_1> id_class;
   private rLq_1[] id_break = new rLq_1[0];
   private rLq_1[] id_byte = new rLq_1[0];
   private Set<rLv_1> id_protected;
   private int id_throws;
   private final rfH_2 id_case;
   private final float id_catch;
   private final boolean id_private;

   public boolean id_byte() {
      return this.id_throws >= this.id_class.size();
   }

   public void id_byte(int var1) {
      this.id_throws = var1;
   }

   public rLC(List<rLq_1> var1, rfH_2 var2, boolean var3) {
      this.id_class = var1;
      this.id_case = var2;
      this.id_catch = var1.isEmpty() ? Float.MAX_VALUE : this.id_class.get(this.id_class.size() - 1).id_class(this.id_case);
      this.id_private = var3;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.id_class.size() + ")";
   }

   public boolean id_class(rLC var1) {
      if (var1 == null) {
         return false;
      } else if (var1.id_class.size() != this.id_class.size()) {
         return false;
      } else {
         for (int var2 = 0; var2 < this.id_class.size(); var2++) {
            rLq_1 var3 = this.id_class.get(var2);
            rLq_1 var4 = var1.id_class.get(var2);
            if (var3.id_class != var4.id_class || var3.id_break != var4.id_break || var3.id_byte != var4.id_byte) {
               return false;
            }
         }

         return true;
      }
   }

   public rjU_2 id_class(an_3 var1) {
      return this.id_class(var1, this.id_throws);
   }

   public rjU_2 id_class(an_3 var1, int var2) {
      rLq_1 var3 = this.id_class.get(var2);
      double var4 = (double)var3.id_class + (double)((int)(var1.PN() + 1.0F)) * 0.5;
      double var6 = (double)var3.id_break;
      double var8 = (double)var3.id_byte + (double)((int)(var1.PN() + 1.0F)) * 0.5;
      return new rjU_2(var4, var6, var8);
   }

   public static rLC id_class(ruu_3 var0) {
      boolean var1 = var0.readBoolean();
      int var2 = var0.readInt();
      int var3 = var0.readInt();
      HashSet var4 = Sets.newHashSet();

      for (int var5 = 0; var5 < var3; var5++) {
         var4.add(rLv_1.id_class(var0));
      }

      rfH_2 var11 = new rfH_2(var0.readInt(), var0.readInt(), var0.readInt());
      ArrayList var6 = Lists.newArrayList();
      int var7 = var0.readInt();

      for (int var8 = 0; var8 < var7; var8++) {
         var6.add(rLq_1.id_break(var0));
      }

      rLq_1[] var12 = new rLq_1[var0.readInt()];

      for (int var9 = 0; var9 < var12.length; var9++) {
         var12[var9] = rLq_1.id_break(var0);
      }

      rLq_1[] var13 = new rLq_1[var0.readInt()];

      for (int var10 = 0; var10 < var13.length; var10++) {
         var13[var10] = rLq_1.id_break(var0);
      }

      rLC var14 = new rLC(var6, var11, var1);
      var14.id_break = var12;
      var14.id_byte = var13;
      var14.id_protected = var4;
      var14.id_throws = var2;
      return var14;
   }

   public void id_class() {
      this.id_throws++;
   }

   public void id_class(int var1, rLq_1 var2) {
      this.id_class.set(var1, var2);
   }

   public rLq_1 id_class(int var1) {
      return this.id_class.get(var1);
   }

   public boolean id_break() {
      return this.id_throws <= 0;
   }

   public void id_break(int var1) {
      if (this.id_class.size() > var1) {
         this.id_class.subList(var1, this.id_class.size()).clear();
      }
   }

   public int id_throws() {
      return this.id_class.size();
   }

   public boolean id_finally() {
      return this.id_private;
   }

   public rfH_2 id_catch() {
      return this.id_class.get(this.id_throws).id_byte();
   }

   public rLq_1[] id_extends() {
      return this.id_break;
   }

   public int id_case() {
      return this.id_throws;
   }

   public rLq_1 id_implements() {
      return this.id_throws > 0 ? this.id_class.get(this.id_throws - 1) : null;
   }

   public rLq_1 id_protected() {
      return !this.id_class.isEmpty() ? this.id_class.get(this.id_class.size() - 1) : null;
   }

   public rfH_2 id_protected(int var1) {
      return this.id_class.get(var1).id_byte();
   }

   public rLq_1 id_private() {
      return this.id_class.get(this.id_throws);
   }

   public float id_final() {
      return this.id_catch;
   }

   public rfH_2 id_volatile() {
      return this.id_case;
   }

   public rLq_1[] id_native() {
      return this.id_byte;
   }
}
