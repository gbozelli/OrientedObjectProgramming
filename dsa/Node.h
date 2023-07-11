#ifndef Node_H
#define Node_H

class Node{
  Node *next;
  double value;
  Node(int value){
    this->value = value;
  };
};

#endif