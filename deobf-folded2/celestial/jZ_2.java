package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.stream.Collectors;

public class jZ_2 {
   private ImmutableList<jv_3> id_class;
   private IntList id_break = new IntArrayList();
   private int id_byte;
   private String id_protected;
   private int id_throws = -1;
   private int id_case = -1;
   private int id_catch = -1;
   private Int2IntMap id_private = new Int2IntArrayMap();

   public int id_byte(int var1) {
      return this.id_private.get(var1);
   }

   public ImmutableList<jv_3> id_byte() {
      return this.id_class;
   }

   public jZ_2(ImmutableList<jv_3> var1) {
      this.id_class = var1;
      int var2 = 0;
      UnmodifiableIterator var3 = var1.iterator();

      while (var3.hasNext()) {
         jv_3 var4 = (jv_3)var3.next();
         this.id_break.add(var2);
         jL_2 var5 = var4.id_break();
         if (var5 == jL_2.POSITION) {
            this.id_throws = var2;
         } else if (var5 == jL_2.NORMAL) {
            this.id_case = var2;
         } else if (var5 == jL_2.COLOR) {
            this.id_catch = var2;
         } else if (var5 == jL_2.UV) {
            this.id_private.put(var4.id_byte(), var2);
         }

         var2 += var4.id_protected();
      }

      this.id_byte = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         jZ_2 var2 = (jZ_2)var1;
         return this.id_byte != var2.id_byte ? false : this.id_class.equals(var2.id_class);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "format: "
         + this.id_protected
         + " "
         + this.id_class.size()
         + " elements: "
         + this.id_class.stream().map(Object::toString).collect(Collectors.joining(" "));
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   public int id_class() {
      return this.id_break() >> 2;
   }

   public int id_class(int var1) {
      return this.id_break.getInt(var1);
   }

   public void id_class(String var1) {
      this.id_protected = var1;
   }

   public void id_class(long var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.id_class(var1));
      } else {
         int var3 = this.id_break();
         ImmutableList var4 = this.id_byte();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            ((jv_3)var4.get(var5)).id_class(var1 + (long)this.id_break.getInt(var5), var3);
         }
      }
   }

   public void id_class(jZ_2 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_case = var1.id_case;
      this.id_catch = var1.id_catch;
      this.id_private = var1.id_private;
   }

   public boolean id_break(int var1) {
      return this.id_private.containsKey(var1);
   }

   public int id_break() {
      return this.id_byte;
   }

   public boolean id_throws() {
      return this.id_throws >= 0;
   }

   public int id_finally() {
      return this.id_catch;
   }

   public boolean id_catch() {
      return this.id_case >= 0;
   }

   public String id_extends() {
      return this.id_protected;
   }

   public int id_case() {
      return this.id_throws;
   }

   public boolean id_implements() {
      return this.id_catch >= 0;
   }

   public void id_protected() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(this::id_protected);
      } else {
         UnmodifiableIterator var1 = this.id_byte().iterator();

         while (var1.hasNext()) {
            jv_3 var2 = (jv_3)var1.next();
            var2.id_throws();
         }
      }
   }

   public int id_private() {
      return this.id_case;
   }

   public jZ_2 id_native() {
      jZ_2 var1 = new jZ_2(ImmutableList.of());
      var1.id_class(this);
      return var1;
   }
}
