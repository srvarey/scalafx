package scalafx.scene.effect

/*
 * Copyright (c) 2012, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import javafx.scene.{effect => jfxse}

object EffectIncludes extends EffectIncludes

trait EffectIncludes {
  implicit def jfxBlend2sfx(b: jfxse.Blend) = new Blend(b)
  implicit def jfxBloom2sfx(b: jfxse.Bloom) = new Bloom(b)
  implicit def jfxBoxBlur2sfx(bb: jfxse.BoxBlur) = new BoxBlur(bb)
  implicit def jfxColorAdjust2sfx(ca: jfxse.ColorAdjust) = new ColorAdjust(ca)
  implicit def jfxColorInput2sfx(ci: jfxse.ColorInput) = new ColorInput(ci)
  implicit def jfxDisplacementMap2sfx(dm: jfxse.DisplacementMap) = new DisplacementMap(dm)
  implicit def jfxEffect2sfx(e: jfxse.Effect) = new Effect(e) {}
  implicit def jfxDropShadow2sfx(ds: jfxse.DropShadow) = new DropShadow(ds)
  implicit def jfxFloatMap2sfx(fm: jfxse.FloatMap) = new FloatMap(fm)
}