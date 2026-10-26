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
   private ImmutableList<jv_3> class_;
   private IntList break_ = new IntArrayList();
   private int byte_;
   private String protected_;
   private int throws_ = -1;
   private int case_ = -1;
   private int catch_ = -1;
   private Int2IntMap private_ = new Int2IntArrayMap();

   public int byte_(int var1) {
      return this.private_.get(var1);
   }

   public ImmutableList<jv_3> byte_() {
      return this.class_;
   }

   public jZ_2(ImmutableList<jv_3> var1) {
      this.class_ = var1;
      int var2 = 0;
      UnmodifiableIterator var3 = var1.iterator();

      while (var3.hasNext()) {
         jv_3 var4 = (jv_3)var3.next();
         this.break_.add(var2);
         jL_2 var5 = var4.break_();
         if (var5 == jL_2.POSITION) {
            this.throws_ = var2;
         } else if (var5 == jL_2.NORMAL) {
            this.case_ = var2;
         } else if (var5 == jL_2.COLOR) {
            this.catch_ = var2;
         } else if (var5 == jL_2.UV) {
            this.private_.put(var4.byte_(), var2);
         }

         var2 += var4.protected_();
      }

      this.byte_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         jZ_2 var2 = (jZ_2)var1;
         return this.byte_ != var2.byte_ ? false : this.class_.equals(var2.class_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "format: "
         + this.protected_
         + " "
         + this.class_.size()
         + " elements: "
         + this.class_.stream().map(Object::toString).collect(Collectors.joining(" "));
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   public int class_() {
      return this.break_() >> 2;
   }

   public int class_(int var1) {
      return this.break_.getInt(var1);
   }

   public void class_(String var1) {
      this.protected_ = var1;
   }

   public void class_(long var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.class_(var1));
      } else {
         int var3 = this.break_();
         ImmutableList var4 = this.byte_();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            ((jv_3)var4.get(var5)).class_(var1 + (long)this.break_.getInt(var5), var3);
         }
      }
   }

   public void class_(jZ_2 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.case_ = var1.case_;
      this.catch_ = var1.catch_;
      this.private_ = var1.private_;
   }

   public boolean break_(int var1) {
      return this.private_.containsKey(var1);
   }

   public int break_() {
      return this.byte_;
   }

   public boolean throws_() {
      return this.throws_ >= 0;
   }

   public int finally_() {
      return this.catch_;
   }

   public boolean catch_() {
      return this.case_ >= 0;
   }

   public String extends_() {
      return this.protected_;
   }

   public int case_() {
      return this.throws_;
   }

   public boolean implements_() {
      return this.catch_ >= 0;
   }

   public void protected_() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(this::protected_);
      } else {
         UnmodifiableIterator var1 = this.byte_().iterator();

         while (var1.hasNext()) {
            jv_3 var2 = (jv_3)var1.next();
            var2.throws_();
         }
      }
   }

   public int private_() {
      return this.case_;
   }

   public jZ_2 native_() {
      jZ_2 var1 = new jZ_2(ImmutableList.of());
      var1.class_(this);
      return var1;
   }
}
