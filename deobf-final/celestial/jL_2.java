package celestial;

import java.util.function.IntConsumer;

public enum jL_2 {
   POSITION("Position", (var0, var1, var2, var3, var5) -> {
      MT.break_(var0, var1, var2, var3);
      MT.public_(32884);
   }, var0 -> MT.goto_(32884)),
   NORMAL("Normal", (var0, var1, var2, var3, var5) -> {
      MT.class_(var1, var2, var3);
      MT.public_(32885);
   }, var0 -> MT.goto_(32885)),
   COLOR("Vertex Color", (var0, var1, var2, var3, var5) -> {
      MT.byte_(var0, var1, var2, var3);
      MT.public_(32886);
   }, var0 -> {
      MT.goto_(32886);
      MT.double_();
   }),
   UV("UV", (var0, var1, var2, var3, var5) -> {
      MT.final_(33984 + var5);
      MT.class_(var0, var1, var2, var3);
      MT.public_(32888);
      MT.final_(33984);
   }, var0 -> {
      MT.final_(33984 + var0);
      MT.goto_(32888);
      MT.final_(33984);
   }),
   PADDING("Padding", (var0, var1, var2, var3, var5) -> {
   }, var0 -> {
   }),
   GENERIC("Generic", (var0, var1, var2, var3, var5) -> {
      MT.while_(var5);
      MT.class_(var5, var0, var1, false, var2, var3);
   }, MT::try_);

   private final String displayName;
   private final jA_2 setupState;
   private final IntConsumer clearState;

   private jL_2(String var3, jA_2 var4, IntConsumer var5) {
      this.displayName = var3;
      this.setupState = var4;
      this.clearState = var5;
   }

   public void class_(int var1) {
      this.clearState.accept(var1);
   }

   void class_(int var1, int var2, int var3, long var4, int var6) {
      this.setupState.setupBufferState(var1, var2, var3, var4, var6);
   }

   public String class_() {
      return this.displayName;
   }
}
