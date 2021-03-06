package com.github.daniel0611.aoc2020


object Day1 extends AoCChallenge[List[Int], Int] {
  def day = 1

  def parsePuzzleInput(in: List[String]): List[Int] = in.map(_.toInt)

  def runA(in: List[Int]): Int = {
    val pairs = for (a <- in; b <- in; if a != b) yield (a, b)
    pairs.foreach(pair => {
      val a = pair._1
      val b = pair._2
      if (a + b == 2020) {
        return a * b
      }
    })
    throw new Exception("no pair with sum of 2020 found!")
  }

  def runB(in: List[Int]): Int = {
    val triples = for (a <- in; b <- in; c <- in; if a != b && b != c) yield (a, b, c)
    triples.foreach(triple => {
      val a = triple._1
      val b = triple._2
      val c = triple._3
      if (a + b + c == 2020) {
        return a * b * c
      }
    })
    throw new Exception("no triple with sum of 2020 found!")
  }
}

